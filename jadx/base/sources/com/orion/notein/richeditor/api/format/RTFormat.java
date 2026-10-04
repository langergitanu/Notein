package com.orion.notein.richeditor.api.format;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RTFormat {
    public static final Spanned SPANNED = new Spanned();
    public static final PlainText PLAIN_TEXT = new PlainText();
    public static final Html HTML = new Html();

    public static class Html extends RTFormat {
    }

    public static class PlainText extends RTFormat {
    }

    public static class Spanned extends RTFormat {
    }
}
