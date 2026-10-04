package o0000;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22218Oooo;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import o0000.C24041OooO0Oo;
import o0000.C24044OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 implements C24041OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f80977OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C24044OooO0oo f80974OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f80975OooO0O0 = 0.0f;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<C24044OooO0oo> f80976OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f80978OooO0o0 = false;

    public interface OooO00o {
        int OooO();

        C24044OooO0oo OooO00o(int i);

        void OooO0O0(C24044OooO0oo c24044OooO0oo, float f, boolean z);

        float OooO0OO(C24044OooO0oo c24044OooO0oo, boolean z);

        float OooO0Oo(OooO0O0 oooO0O0, boolean z);

        boolean OooO0o(C24044OooO0oo c24044OooO0oo);

        void OooO0o0(float f);

        void OooO0oO();

        float OooO0oo(C24044OooO0oo c24044OooO0oo);

        float OooOO0(int i);

        void OooOO0O(C24044OooO0oo c24044OooO0oo, float f);

        void clear();
    }

    public OooO0O0() {
    }

    public void OooO(C24041OooO0Oo c24041OooO0Oo, OooO0O0 oooO0O0, boolean z) {
        float fOooO0Oo = this.f80977OooO0Oo.OooO0Oo(oooO0O0, z);
        this.f80975OooO0O0 = (oooO0O0.f80975OooO0O0 * fOooO0Oo) + this.f80975OooO0O0;
        if (z) {
            oooO0O0.f80974OooO00o.OooO0O0(this);
        }
        if (this.f80974OooO00o == null || this.f80977OooO0Oo.OooO() != 0) {
            return;
        }
        this.f80978OooO0o0 = true;
        c24041OooO0Oo.f80985OooO0O0 = true;
    }

    @Override // o0000.C24041OooO0Oo.OooO00o
    public C24044OooO0oo OooO00o(boolean[] zArr) {
        return OooO0o(zArr, null);
    }

    public final void OooO0O0(C24041OooO0Oo c24041OooO0Oo, int i) {
        this.f80977OooO0Oo.OooOO0O(c24041OooO0Oo.OooOO0(i), 1.0f);
        this.f80977OooO0Oo.OooOO0O(c24041OooO0Oo.OooOO0(i), -1.0f);
    }

    public final void OooO0OO(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, C24044OooO0oo c24044OooO0oo3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f80975OooO0O0 = i;
        }
        if (z) {
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, -1.0f);
        } else {
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo, -1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, 1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, 1.0f);
        }
    }

    public final void OooO0Oo(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2, C24044OooO0oo c24044OooO0oo3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f80975OooO0O0 = i;
        }
        if (z) {
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo, 1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, 1.0f);
        } else {
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo, -1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, 1.0f);
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo3, -1.0f);
        }
    }

    public final C24044OooO0oo OooO0o(boolean[] zArr, C24044OooO0oo c24044OooO0oo) {
        C24044OooO0oo.OooO00o oooO00o;
        int iOooO = this.f80977OooO0Oo.OooO();
        C24044OooO0oo c24044OooO0oo2 = null;
        float f = 0.0f;
        for (int i = 0; i < iOooO; i++) {
            float fOooOO0 = this.f80977OooO0Oo.OooOO0(i);
            if (fOooOO0 < 0.0f) {
                C24044OooO0oo c24044OooO0ooOooO00o = this.f80977OooO0Oo.OooO00o(i);
                if ((zArr == null || !zArr[c24044OooO0ooOooO00o.f81007OooOo]) && c24044OooO0ooOooO00o != c24044OooO0oo && (((oooO00o = c24044OooO0ooOooO00o.f81015OooOooo) == C24044OooO0oo.OooO00o.f81019OooOo || oooO00o == C24044OooO0oo.OooO00o.f81022OooOoO0) && fOooOO0 < f)) {
                    f = fOooOO0;
                    c24044OooO0oo2 = c24044OooO0ooOooO00o;
                }
            }
        }
        return c24044OooO0oo2;
    }

    public boolean OooO0o0() {
        return this.f80974OooO00o == null && this.f80975OooO0O0 == 0.0f && this.f80977OooO0Oo.OooO() == 0;
    }

    public final void OooO0oO(C24044OooO0oo c24044OooO0oo) {
        C24044OooO0oo c24044OooO0oo2 = this.f80974OooO00o;
        if (c24044OooO0oo2 != null) {
            this.f80977OooO0Oo.OooOO0O(c24044OooO0oo2, -1.0f);
            this.f80974OooO00o.f81010OooOoO0 = -1;
            this.f80974OooO00o = null;
        }
        float fOooO0OO = this.f80977OooO0Oo.OooO0OO(c24044OooO0oo, true) * (-1.0f);
        this.f80974OooO00o = c24044OooO0oo;
        if (fOooO0OO == 1.0f) {
            return;
        }
        this.f80975OooO0O0 /= fOooO0OO;
        this.f80977OooO0Oo.OooO0o0(fOooO0OO);
    }

    public final void OooO0oo(C24041OooO0Oo c24041OooO0Oo, C24044OooO0oo c24044OooO0oo, boolean z) {
        if (c24044OooO0oo == null || !c24044OooO0oo.f81013OooOoo0) {
            return;
        }
        float fOooO0oo = this.f80977OooO0Oo.OooO0oo(c24044OooO0oo);
        this.f80975OooO0O0 = (c24044OooO0oo.f81011OooOoOO * fOooO0oo) + this.f80975OooO0O0;
        this.f80977OooO0Oo.OooO0OO(c24044OooO0oo, z);
        if (z) {
            c24044OooO0oo.OooO0O0(this);
        }
        if (this.f80977OooO0Oo.OooO() == 0) {
            this.f80978OooO0o0 = true;
            c24041OooO0Oo.f80985OooO0O0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(this.f80974OooO00o == null ? "0" : "" + this.f80974OooO00o, " = ");
        if (this.f80975OooO0O0 != 0.0f) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO0Oo);
            sbOooO0OO.append(this.f80975OooO0O0);
            strOooO0Oo = sbOooO0OO.toString();
            z = true;
        } else {
            z = false;
        }
        int iOooO = this.f80977OooO0Oo.OooO();
        for (int i = 0; i < iOooO; i++) {
            C24044OooO0oo c24044OooO0ooOooO00o = this.f80977OooO0Oo.OooO00o(i);
            if (c24044OooO0ooOooO00o != null) {
                float fOooOO0 = this.f80977OooO0Oo.OooOO0(i);
                if (fOooOO0 != 0.0f) {
                    String string = c24044OooO0ooOooO00o.toString();
                    if (!z) {
                        if (fOooOO0 < 0.0f) {
                            strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, "- ");
                            fOooOO0 *= -1.0f;
                        }
                        strOooO0Oo = fOooOO0 == 1.0f ? C21111o0ooOoO.OooO0Oo(strOooO0Oo, string) : strOooO0Oo + fOooOO0 + " " + string;
                        z = true;
                    } else if (fOooOO0 > 0.0f) {
                        strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, " + ");
                        if (fOooOO0 == 1.0f) {
                        }
                        z = true;
                    } else {
                        strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, " - ");
                        fOooOO0 *= -1.0f;
                        if (fOooOO0 == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? C21111o0ooOoO.OooO0Oo(strOooO0Oo, IdManager.DEFAULT_VERSION_NAME) : strOooO0Oo;
    }

    public OooO0O0(OooO0OO oooO0OO) {
        this.f80977OooO0Oo = new o0000.OooO00o(this, oooO0OO);
    }
}
