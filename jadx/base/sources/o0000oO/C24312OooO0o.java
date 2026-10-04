package o0000oO;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o0000oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24312OooO0o implements InterfaceC24311OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC24322OooOOOo f81836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f81837OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f81839OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC24322OooOOOo f81833OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f81834OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f81835OooO0OO = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f81838OooO0o0 = OooO00o.f81845OooOo0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f81840OooO0oo = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C24314OooO0oO f81832OooO = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f81841OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f81842OooOO0O = new ArrayList();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f81843OooOO0o = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0000oO.OooO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f81844OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f81845OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f81846OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f81847OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f81848OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f81849OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f81850OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final OooO00o f81851OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f81852OooOooo;

        static {
            OooO00o oooO00o = new OooO00o(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            f81845OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("HORIZONTAL_DIMENSION", 1);
            f81844OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("VERTICAL_DIMENSION", 2);
            f81847OooOoO0 = oooO00o3;
            OooO00o oooO00o4 = new OooO00o("LEFT", 3);
            f81846OooOoO = oooO00o4;
            OooO00o oooO00o5 = new OooO00o("RIGHT", 4);
            f81848OooOoOO = oooO00o5;
            OooO00o oooO00o6 = new OooO00o("TOP", 5);
            f81850OooOoo0 = oooO00o6;
            OooO00o oooO00o7 = new OooO00o("BOTTOM", 6);
            f81849OooOoo = oooO00o7;
            OooO00o oooO00o8 = new OooO00o("BASELINE", 7);
            f81851OooOooO = oooO00o8;
            f81852OooOooo = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f81852OooOooo.clone();
        }
    }

    public C24312OooO0o(AbstractC24322OooOOOo abstractC24322OooOOOo) {
        this.f81836OooO0Oo = abstractC24322OooOOOo;
    }

    @Override // o0000oO.InterfaceC24311OooO0Oo
    public final void OooO00o(InterfaceC24311OooO0Oo interfaceC24311OooO0Oo) {
        ArrayList<C24312OooO0o> arrayList = this.f81843OooOO0o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C24312OooO0o) it.next()).f81841OooOO0) {
                return;
            }
        }
        this.f81835OooO0OO = true;
        AbstractC24322OooOOOo abstractC24322OooOOOo = this.f81833OooO00o;
        if (abstractC24322OooOOOo != null) {
            abstractC24322OooOOOo.OooO00o(this);
        }
        if (this.f81834OooO0O0) {
            this.f81836OooO0Oo.OooO00o(this);
            return;
        }
        C24312OooO0o c24312OooO0o = null;
        int i = 0;
        for (C24312OooO0o c24312OooO0o2 : arrayList) {
            if (!(c24312OooO0o2 instanceof C24314OooO0oO)) {
                i++;
                c24312OooO0o = c24312OooO0o2;
            }
        }
        if (c24312OooO0o != null && i == 1 && c24312OooO0o.f81841OooOO0) {
            C24314OooO0oO c24314OooO0oO = this.f81832OooO;
            if (c24314OooO0oO != null) {
                if (!c24314OooO0oO.f81841OooOO0) {
                    return;
                } else {
                    this.f81837OooO0o = this.f81840OooO0oo * c24314OooO0oO.f81839OooO0oO;
                }
            }
            OooO0Oo(c24312OooO0o.f81839OooO0oO + this.f81837OooO0o);
        }
        AbstractC24322OooOOOo abstractC24322OooOOOo2 = this.f81833OooO00o;
        if (abstractC24322OooOOOo2 != null) {
            abstractC24322OooOOOo2.OooO00o(this);
        }
    }

    public final void OooO0O0(AbstractC24322OooOOOo abstractC24322OooOOOo) {
        this.f81842OooOO0O.add(abstractC24322OooOOOo);
        if (this.f81841OooOO0) {
            abstractC24322OooOOOo.OooO00o(abstractC24322OooOOOo);
        }
    }

    public final void OooO0OO() {
        this.f81843OooOO0o.clear();
        this.f81842OooOO0O.clear();
        this.f81841OooOO0 = false;
        this.f81839OooO0oO = 0;
        this.f81835OooO0OO = false;
        this.f81834OooO0O0 = false;
    }

    public void OooO0Oo(int i) {
        if (this.f81841OooOO0) {
            return;
        }
        this.f81841OooOO0 = true;
        this.f81839OooO0oO = i;
        for (InterfaceC24311OooO0Oo interfaceC24311OooO0Oo : this.f81842OooOO0O) {
            interfaceC24311OooO0Oo.OooO00o(interfaceC24311OooO0Oo);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f81836OooO0Oo.f81876OooO0O0.f82053Ooooooo);
        sb.append(C18241k5.f55433h);
        sb.append(this.f81838OooO0o0);
        sb.append("(");
        sb.append(this.f81841OooOO0 ? Integer.valueOf(this.f81839OooO0oO) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f81843OooOO0o.size());
        sb.append(":d=");
        sb.append(this.f81842OooOO0O.size());
        sb.append(">");
        return sb.toString();
    }
}
