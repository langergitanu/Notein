package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE4 {
    static final String zzWJm;
    static final String zzWJn;
    static final zzZDV zzWJo;

    static {
        zzZDV zzzdv = new zzZDV(true);
        zzWJo = zzzdv;
        zzWJn = zzzdv.zzwV("xml");
        zzWJm = zzzdv.zzwV("xmlns");
        zzzdv.zzwV("id");
        zzzdv.zzwV("name");
        zzzdv.zzwV("xsd");
        zzzdv.zzwV("xsi");
        zzzdv.zzwV(C18437z2.f56754h);
        zzzdv.zzwV("soap");
        zzzdv.zzwV("SOAP-ENC");
        zzzdv.zzwV("SOAP-ENV");
        zzzdv.zzwV("Body");
        zzzdv.zzwV("Envelope");
    }

    public static String zzXLI() {
        return zzWJm;
    }

    public static String zzXLJ() {
        return zzWJn;
    }

    public static zzZDV zzXLK() {
        return zzWJo.zzXLx();
    }
}
