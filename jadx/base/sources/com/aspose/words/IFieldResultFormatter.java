package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public interface IFieldResultFormatter {
    String format(double d, int i);

    String format(String str, int i);

    String formatDateTime(Date date, String str, int i);

    String formatNumeric(double d, String str);
}
