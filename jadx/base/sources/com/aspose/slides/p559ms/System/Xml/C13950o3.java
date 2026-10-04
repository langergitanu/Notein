package com.aspose.slides.p559ms.System.Xml;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.o3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13950o3 implements IEnumerable, InterfaceC13980t6 {

    /* JADX INFO: renamed from: du */
    private Dictionary<String, Integer> f46675du;

    /* JADX INFO: renamed from: dy */
    private String f46676dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f46677h4;

    /* JADX INFO: renamed from: k4 */
    private k4[] f46678k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13883dt f46679kk;

    /* JADX INFO: renamed from: m9 */
    private String f46680m9;

    /* JADX INFO: renamed from: to */
    private int f46681to;

    /* JADX INFO: renamed from: x1 */
    private int f46682x1;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.o3$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public String f46683k4;

        /* JADX INFO: renamed from: kk */
        public int f46684kk;

        /* JADX INFO: renamed from: to */
        public int f46685to;

        /* JADX INFO: renamed from: x1 */
        public String f46686x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m65710x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f46683k4, this.f46683k4) && C14067j2.m66728k4(k4Var.f46686x1, this.f46686x1) && k4Var.f46684kk == this.f46684kk && k4Var.f46685to == this.f46685to;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m65710x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f46683k4 = this.f46683k4;
            k4Var.f46686x1 = this.f46686x1;
            k4Var.f46684kk = this.f46684kk;
            k4Var.f46685to = this.f46685to;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65713k4(String str, String str2, int i, int i2) {
            this.f46683k4 = str;
            this.f46686x1 = str2;
            this.f46684kk = i;
            this.f46685to = i2;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new C13873cj());
    }

    public C13950o3() {
        this.f46682x1 = 0;
    }

    /* JADX INFO: renamed from: kk */
    private int m65705kk(String str) {
        if (this.f46677h4) {
            Integer[] numArr = {0};
            boolean zTryGetValue = this.f46675du.tryGetValue(str, numArr);
            int iIntValue = numArr[0].intValue();
            if (!zTryGetValue) {
                return -1;
            }
            while (iIntValue != -1) {
                k4 k4Var = this.f46678k4[iIntValue];
                if (k4Var.f46686x1 != null) {
                    break;
                }
                iIntValue = k4Var.f46685to;
            }
            return iIntValue;
        }
        for (int i = this.f46682x1; i >= 0; i--) {
            k4 k4Var2 = this.f46678k4[i];
            if (k4Var2.f46683k4 == str && k4Var2.f46686x1 != null) {
                return i;
            }
        }
        for (int i2 = this.f46682x1; i2 >= 0; i2--) {
            if (C14113y2.m67363du(this.f46678k4[i2].f46683k4, str) && this.f46678k4[i2].f46686x1 != null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        Dictionary dictionary = new Dictionary(this.f46682x1 + 1);
        for (int i = 0; i <= this.f46682x1; i++) {
            k4 k4Var = this.f46678k4[i];
            if (k4Var.f46686x1 != null) {
                String str = k4Var.f46683k4;
                dictionary.set_Item(str, str);
            }
        }
        return dictionary.getKeys().iterator();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public IGenericDictionary<String, String> mo52690k4(int i) {
        int i2;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = 0;
        } else {
            int i3 = this.f46682x1;
            while (this.f46678k4[i3].f46684kk == this.f46681to) {
                i3--;
            }
            i2 = i3 + 1;
        }
        Dictionary dictionary = new Dictionary((this.f46682x1 - i2) + 1);
        while (i2 <= this.f46682x1) {
            k4 k4Var = this.f46678k4[i2];
            String str = k4Var.f46683k4;
            String str2 = k4Var.f46686x1;
            if (str2 != null) {
                if (str2.length() > 0 || str.length() > 0 || i == 2) {
                    dictionary.set_Item(str, str2);
                } else {
                    dictionary.removeItemByKey(str);
                }
            }
            i2++;
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo65709to() {
        int i = this.f46682x1;
        if (this.f46681to == 1) {
            return false;
        }
        while (true) {
            k4 k4Var = this.f46678k4[i];
            int i2 = k4Var.f46684kk;
            int i3 = this.f46681to;
            if (i2 != i3) {
                this.f46682x1 = i;
                this.f46681to = i3 - 1;
                return true;
            }
            if (this.f46677h4) {
                this.f46675du.set_Item(k4Var.f46683k4, Integer.valueOf(k4Var.f46685to));
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public String mo23227x1() {
        String strMo13292k4 = mo13292k4(C14113y2.f47374k4);
        return strMo13292k4 == null ? C14113y2.f47374k4 : strMo13292k4;
    }

    public C13950o3(AbstractC13883dt abstractC13883dt) {
        this.f46682x1 = 0;
        this.f46679kk = abstractC13883dt;
        this.f46680m9 = abstractC13883dt.mo65266k4("xml");
        this.f46676dy = abstractC13883dt.mo65266k4("xmlns");
        this.f46678k4 = (k4[]) C22200OooO0o0.OooO00o(k4.class, 8);
        String strMo65266k4 = abstractC13883dt.mo65266k4(C14113y2.f47374k4);
        this.f46678k4[0].m65713k4(strMo65266k4, strMo65266k4, -1, -1);
        this.f46678k4[1].m65713k4(this.f46676dy, abstractC13883dt.mo65266k4("http://www.w3.org/2000/xmlns/"), -1, -1);
        this.f46678k4[2].m65713k4(this.f46680m9, abstractC13883dt.mo65266k4("http://www.w3.org/XML/1998/namespace"), 0, -1);
        this.f46682x1 = 2;
        this.f46681to = 1;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13883dt m65706k4() {
        return this.f46679kk;
    }

    /* JADX INFO: renamed from: kk */
    public void mo65708kk() {
        this.f46681to++;
    }

    /* JADX INFO: renamed from: x1 */
    public String mo52700x1(String str) {
        for (int i = this.f46682x1; i >= 0; i--) {
            if (C14113y2.m67363du(this.f46678k4[i].f46686x1, str)) {
                String str2 = this.f46678k4[i].f46683k4;
                if (C14113y2.m67363du(mo13292k4(str2), str)) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        int iM65705kk = m65705kk(str);
        if (iM65705kk == -1) {
            return null;
        }
        return this.f46678k4[iM65705kk].f46686x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo65707k4(String str, String str2) {
        if (str2 == null) {
            throw new ArgumentNullException("uri");
        }
        if (str == null) {
            throw new ArgumentNullException(RequestParameters.PREFIX);
        }
        String strMo65266k4 = this.f46679kk.mo65266k4(str);
        String strMo65266k42 = this.f46679kk.mo65266k4(str2);
        if (C13851ai.m65152k4(this.f46680m9, strMo65266k4) && !C14113y2.m67363du(strMo65266k42, "http://www.w3.org/XML/1998/namespace")) {
            throw new ArgumentException(C13968ri.m65818k4("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\"."));
        }
        if (C13851ai.m65152k4(this.f46676dy, strMo65266k4)) {
            throw new ArgumentException(C13968ri.m65818k4("Prefix \"xmlns\" is reserved for use by XML."));
        }
        int iM65705kk = m65705kk(strMo65266k4);
        if (iM65705kk != -1) {
            k4 k4Var = this.f46678k4[iM65705kk];
            if (k4Var.f46684kk == this.f46681to) {
                k4Var.f46686x1 = strMo65266k42;
                return;
            }
        } else {
            iM65705kk = -1;
        }
        if (this.f46682x1 == this.f46678k4.length - 1) {
            k4[] k4VarArr = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), this.f46678k4.length * 2));
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f46678k4), 0, AbstractC14092to.m67208k4((Object) k4VarArr), 0, this.f46678k4.length);
            this.f46678k4 = k4VarArr;
        }
        k4[] k4VarArr2 = this.f46678k4;
        int i = this.f46682x1 + 1;
        this.f46682x1 = i;
        k4VarArr2[i].m65713k4(strMo65266k4, strMo65266k42, this.f46681to, iM65705kk);
        if (this.f46677h4) {
            this.f46675du.set_Item(strMo65266k4, Integer.valueOf(this.f46682x1));
            return;
        }
        if (this.f46682x1 >= 16) {
            this.f46675du = new Dictionary<>(this.f46682x1);
            for (int i2 = 0; i2 <= this.f46682x1; i2++) {
                this.f46675du.set_Item(this.f46678k4[i2].f46683k4, Integer.valueOf(i2));
            }
            this.f46677h4 = true;
        }
    }
}
