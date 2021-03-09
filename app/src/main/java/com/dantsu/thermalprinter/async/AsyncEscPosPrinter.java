package com.dantsu.thermalprinter.async;

import com.dantsu.escposprinter.EscPosCharsetEncoding;
import com.dantsu.escposprinter.EscPosPrinterSize;
import com.dantsu.escposprinter.connection.DeviceConnection;

public class AsyncEscPosPrinter extends EscPosPrinterSize {
    private DeviceConnection printerConnection;
    private String textToPrint = "";
    private EscPosCharsetEncoding encoding;

    public AsyncEscPosPrinter(DeviceConnection printerConnection, int printerDpi, float printerWidthMM, int printerNbrCharactersPerLine, EscPosCharsetEncoding encoding) {
        super(printerDpi, printerWidthMM, printerNbrCharactersPerLine);
        this.printerConnection = printerConnection;
        this.encoding = encoding;
    }

    public EscPosCharsetEncoding getEncoding() {
        return encoding;
    }

    public DeviceConnection getPrinterConnection() {
        return this.printerConnection;
    }

    public AsyncEscPosPrinter setTextToPrint(String textToPrint) {
        this.textToPrint = textToPrint;
        return this;
    }

    public String getTextToPrint() {
        return this.textToPrint;
    }
}
