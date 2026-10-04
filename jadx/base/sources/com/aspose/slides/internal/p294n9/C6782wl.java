package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.wl */
/* JADX INFO: loaded from: classes4.dex */
public final class C6782wl extends AbstractC6769ne {

    /* JADX INFO: renamed from: k4 */
    private String f18752k4;

    public C6782wl() {
        this(MsalUtils.QUERY_STRING_SYMBOL);
    }

    /* JADX INFO: renamed from: du */
    public final String m26843du() {
        return this.f18752k4;
    }

    public boolean equals(Object obj) {
        C6782wl c6782wl = (C6782wl) C7019kk.m27452k4(obj, C6782wl.class);
        if (c6782wl != null) {
            return C14113y2.m67363du(this.f18752k4, c6782wl.f18752k4);
        }
        return false;
    }

    public int hashCode() {
        return this.f18752k4.hashCode();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6769ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC6761ix mo26736k4() {
        return new C6771qq(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6769ne
    /* JADX INFO: renamed from: x1 */
    public int mo26737x1() {
        return this.f18752k4.length();
    }

    public C6782wl(String str) {
        if (str == null) {
            throw new ArgumentNullException("replacement");
        }
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            if (C14117yj.m67540to(str, i)) {
                if (C14117yj.m67533kk(str, i)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    i++;
                } else if (!z) {
                    z = true;
                    break;
                } else {
                    z = false;
                    i++;
                }
            } else if (z) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            throw new ArgumentException(C6770qm.m26823k4("String contains invalid Unicode code points.", "replacement"));
        }
        this.f18752k4 = str;
    }
}
