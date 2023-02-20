package org.mozilla.universalchardet;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicFileEncodingDetectionTest {

	@Test
	void testASCII() throws IOException {

		assertEquals("US-ASCII", getFileEncoding("ascii.txt"));
	}

	@Test
	void testUTF8() throws IOException {

		assertEquals("UTF-8", getFileEncoding("utf8.txt"));
	}

	@Test
	void testUTF8N() throws IOException {

		assertEquals("UTF-8", getFileEncoding("utf8n.txt"));
	}

	@Test
	void testUTF16LE() throws IOException {

		assertEquals("UTF-16LE", getFileEncoding("utf16le.txt"));
	}

	@Test
	void testShifJis() throws IOException {

		assertEquals("SHIFT_JIS", getFileEncoding("shiftjis.txt"));
	}

	@Test
	void testEUC() throws IOException {

		assertEquals("EUC-JP", getFileEncoding("euc.txt"));
	}

	@Test
	void testISO2022JP() throws IOException {

		assertEquals("ISO-2022-JP", getFileEncoding("iso2022jp.txt"));
	}

	@Test
	void testBIG5() throws IOException {

		assertEquals("BIG5", getFileEncoding("big5.txt"));
	}

	@Test
	void testEUCTW() throws IOException {

		assertEquals("EUC-TW", getFileEncoding("euctw.txt"));
	}

	@Test
	void testEUCKR() throws IOException {

		assertEquals("EUC-KR", getFileEncoding("euckr.txt"));
	}

	@Test
	void testWindows1255() throws IOException {

		assertEquals("WINDOWS-1255", getFileEncoding("windows1255.txt"));
	}

	@Test
	void testUTF8Emoji() throws IOException {

		assertEquals("UTF-8", getFileEncoding("utf8n-emoji.txt"));
	}

	private String getFileEncoding(String testFileName) throws IOException {

		String fileName = "src/test/resources/" + testFileName;
		return UniversalDetector.detectCharset(new File(fileName));
	}
}
