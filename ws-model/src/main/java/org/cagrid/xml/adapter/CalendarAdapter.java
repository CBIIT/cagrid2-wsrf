package org.cagrid.xml.adapter;

import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class CalendarAdapter extends XmlAdapter<String, Calendar> {

	public static String printCalendar(Calendar c) {
		return DatatypeConverter.printDateTime(c);
	}

	public static Calendar parseCalendar(String s) {
		return DatatypeConverter.parseDateTime(s);
	}

	@Override
	public String marshal(Calendar c) {
		return printCalendar(c);
	}

	@Override
	public Calendar unmarshal(String s) {
		return parseCalendar(s);
	}
}
