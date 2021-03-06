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
package org.globus.ftp.dc;

import java.io.IOException;

import org.globus.ftp.Buffer;

public class StreamAsciiDCReader extends StreamImageDCReader {

    protected AsciiTranslator translator;

    public StreamAsciiDCReader() {
	// only check for \r\n separators - others are ignored
	// output tokens with system specific line separators
	translator = new AsciiTranslator(true, false);
    }

    public Buffer read()
	throws IOException {
	Buffer buf = super.read();
	if (buf == null) {
	    return null;
	}
	return translator.translate(buf);
    }

}
