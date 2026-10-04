package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.fa */
/* JADX INFO: loaded from: classes4.dex */
public final class C6758fa extends AbstractC6751c5 {

    /* JADX INFO: renamed from: k4 */
    private String f18656k4;

    public C6758fa() {
        this(MsalUtils.QUERY_STRING_SYMBOL);
    }

    /* JADX INFO: renamed from: du */
    public final String m26747du() {
        return this.f18656k4;
    }

    public boolean equals(Object obj) {
        C6758fa c6758fa = (C6758fa) C7019kk.m27452k4(obj, C6758fa.class);
        if (c6758fa != null) {
            return C14113y2.m67363du(this.f18656k4, c6758fa.f18656k4);
        }
        return false;
    }

    public int hashCode() {
        return this.f18656k4.hashCode();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6751c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC6762jd mo26734k4() {
        return new C6779up(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6751c5
    /* JADX INFO: renamed from: x1 */
    public int mo26735x1() {
        return this.f18656k4.length();
    }

    public C6758fa(String str) {
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
        this.f18656k4 = str;
    }
}
