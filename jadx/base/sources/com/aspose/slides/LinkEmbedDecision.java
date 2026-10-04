package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkEmbedDecision extends AbstractC14106wy {
    public static final int Embed = 1;
    public static final int Ignore = 2;
    public static final int Link = 0;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(LinkEmbedDecision.class, Integer.class) { // from class: com.aspose.slides.LinkEmbedDecision.1
            {
                addConstant(HttpHeaders.LINK, 0L);
                addConstant("Embed", 1L);
                addConstant("Ignore", 2L);
            }
        });
    }

    private LinkEmbedDecision() {
    }
}
