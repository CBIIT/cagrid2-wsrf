/*
 * Portions of this file Copyright 1999-2005 University of Chicago
 * Portions of this file Copyright 1999-2005 The University of Southern California.
 *
 * This file or a portion of this file is licensed under the
 * terms of the Globus Toolkit Public License, found at
 * http://www.globus.org/toolkit/download/license.html.
 * If you redistribute this file, with or without
 * modifications, you must include this notice in the file.
 */
package org.globus.gatekeeper.jobmanager.internal;

import java.io.InputStream;
import java.io.IOException;

import org.globus.util.http.LineReader;
import org.globus.gram.internal.GRAMProtocol;
import org.globus.gatekeeper.jobmanager.JobManagerException;

public class JobRequestParser {

    protected LineReader _reader = null;

    protected String _callbackURL = null;
    protected String _rsl = null;
    protected int _stateMask = 0;

    public JobRequestParser(InputStream in) {
	_reader = new LineReader(in);
    }

    public JobRequestParser(LineReader reader) {
	_reader = reader;
    }

    public String getRSL() {
	return _rsl;
    }

    public int getJobStateMask() {
	return _stateMask;
    }
    
    public String getCallbackURL() {
	return _callbackURL;
    }

    private String getValueForToken(String expected) 
	throws JobManagerException {
	String line = null;
	try {
	    line = _reader.readLine();
	} catch(IOException e) {
	    throw new JobManagerException("io problems");
	}
        if (line != null && !line.regionMatches(true, 0, expected, 0, expected.length())) {
            throw new JobManagerException("bad request");
	}
	return getRest(line, expected.length());
    }

    public void parse() 
	throws JobManagerException {
	String value = null;
	
	value = getValueForToken(GRAMProtocol.PROTOCOL_VERSION);
	if ( !value.equals(String.valueOf(GRAMProtocol.GRAM_PROTOCOL_VERSION)) ) {
	    throw new JobManagerException(JobManagerException.VERSION_MISMATCH);
	}

	value = getValueForToken(GRAMProtocol.JOB_STATE_MASK);
	try {
	    _stateMask = Integer.parseInt(value);
	} catch(Exception e) {
	    throw new JobManagerException("bad state mask");
	}

	value = getValueForToken(GRAMProtocol.CALLBACK_URL);
	_callbackURL = value;
	 
	value = getValueForToken(GRAMProtocol.RSL);
	_rsl = value;
    }
    
    protected static final String getRest(String line, int index) {
        return line.substring(index).trim();
    }

    public String toString() {
	StringBuffer buf = new StringBuffer();
	buf.append("Job Request: ")
	    .append("RSL: ")
	    .append(_rsl)
	    .append(", ")
	    .append("Client contact: ")
	    .append(_callbackURL)
	    .append(", ")
	    .append("Job status mask: ")
	    .append(String.valueOf(_stateMask));
	return buf.toString();
    }
    
}
