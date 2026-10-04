package com.orion.notein.richeditor.spans;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class URLSpan extends android.text.style.URLSpan implements RTSpan {
    private String mURL;

    public URLSpan(String str) {
        super(str);
        this.mURL = str;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy(Object obj) {
        return new URLSpan((String) obj);
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public Object getValue() {
        return this.mURL;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        super.onClick(view);
    }

    public void setURL(String str) {
        this.mURL = str;
    }

    @Override // com.orion.notein.richeditor.spans.RTSpan
    public RTSpan copy() {
        return new URLSpan(getURL());
    }
}
