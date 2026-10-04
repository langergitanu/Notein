package oO0OOooO;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOOOo.OooOOOO;
import com.aspose.slides.Oooo0;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.C24037Oooo0OO;
import o00O0o.C24923OooO0oo;
import o0Oo0o00.C28195OoooOOo;

/* JADX INFO: renamed from: oO0OOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33146OooO00o extends AbstractC20449OooO0Oo implements InterfaceC33145OooO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24037Oooo0OO f119867OooOo0o;

    /* JADX INFO: renamed from: oO0OOooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20301OooO00o extends OooOOOO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33145OooO f119868OooO0Oo;

        public C20301OooO00o(InterfaceC33145OooO interfaceC33145OooO) {
            this.f119868OooO0Oo = interfaceC33145OooO;
        }
    }

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(10);
        f119867OooOo0o = new C24037Oooo0OO(numberFormat);
        numberFormat.setMinimumFractionDigits(1);
    }

    public AbstractC33146OooO00o() {
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    public InterfaceC33145OooO OooO0O0(AbstractC33146OooO00o abstractC33146OooO00o) {
        C33152OooO0oO.OooO0OO(this, abstractC33146OooO00o);
        int iMo80632c = mo80632c();
        int iMo80628a = abstractC33146OooO00o.mo80628a();
        int iMo80628a2 = mo80628a();
        InterfaceC33145OooO interfaceC33145OooOOoooO00 = OoooO00(iMo80632c, iMo80628a);
        for (int i = 0; i < iMo80632c; i++) {
            for (int i2 = 0; i2 < iMo80628a; i2++) {
                double dMo80627a = 0.0d;
                for (int i3 = 0; i3 < iMo80628a2; i3++) {
                    dMo80627a += abstractC33146OooO00o.mo80627a(i3, i2) * mo80627a(i, i3);
                }
                interfaceC33145OooOOoooO00.OooO00o(dMo80627a, i, i2);
            }
        }
        return interfaceC33145OooOOoooO00;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    public void OooO0Oo(int i, C33148OooO0OO c33148OooO0OO) {
        C33152OooO0oO.OooO0O0(this, i);
        int iMo80632c = mo80632c();
        if (c33148OooO0OO.f119871OooOo0o.length != iMo80632c) {
            throw new C33150OooO0o(c33148OooO0OO.f119871OooOo0o.length, iMo80632c);
        }
        for (int i2 = 0; i2 < iMo80632c; i2++) {
            OooO00o(c33148OooO0OO.OooO00o(i2), i2, i);
        }
    }

    public void Oooo(C20301OooO00o c20301OooO00o) {
        OoooO0(c20301OooO00o);
    }

    public abstract void OoooO0(C20301OooO00o c20301OooO00o);

    public abstract InterfaceC33145OooO OoooO00(int i, int i2);

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public InterfaceC33145OooO mo80629a() {
        int iMo80632c = mo80632c();
        int iMo80628a = mo80628a();
        InterfaceC33145OooO interfaceC33145OooOOoooO00 = OoooO00(iMo80632c, iMo80628a);
        for (int i = 0; i < iMo80632c; i++) {
            for (int i2 = 0; i2 < iMo80628a; i2++) {
                interfaceC33145OooOOoooO00.OooO00o(mo80627a(i, i2) * 2.0d, i, i2);
            }
        }
        return interfaceC33145OooOOoooO00;
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: b */
    public final boolean mo80631b() {
        return mo80628a() == mo80632c();
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: d */
    public InterfaceC33145OooO mo80633d() {
        InterfaceC33145OooO interfaceC33145OooOOoooO00 = OoooO00(mo80628a(), mo80632c());
        Oooo(new C20301OooO00o(interfaceC33145OooOOoooO00));
        return interfaceC33145OooOOoooO00;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC33145OooO) {
            InterfaceC33145OooO interfaceC33145OooO = (InterfaceC33145OooO) obj;
            int iMo80632c = mo80632c();
            int iMo80628a = mo80628a();
            if (interfaceC33145OooO.mo80628a() == iMo80628a && interfaceC33145OooO.mo80632c() == iMo80632c) {
                for (int i = 0; i < iMo80632c; i++) {
                    for (int i2 = 0; i2 < iMo80628a; i2++) {
                        if (mo80627a(i, i2) == interfaceC33145OooO.mo80627a(i, i2)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iMo80632c = mo80632c();
        int iMo80628a = mo80628a();
        int iOooO00o = Oooo0.OooO00o(iMo80632c, 217, 31, iMo80628a);
        for (int i = 0; i < iMo80632c; i++) {
            int i2 = 0;
            while (i2 < iMo80628a) {
                int i3 = i2 + 1;
                iOooO00o = (iOooO00o * 31) + (new Double(mo80627a(i, i2)).hashCode() * ((i3 * 17) + ((i + 1) * 11)));
                i2 = i3;
            }
        }
        return iOooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String name = getClass().getName();
        sb.append(name.substring(name.lastIndexOf(46) + 1));
        C24037Oooo0OO c24037Oooo0OO = f119867OooOo0o;
        c24037Oooo0OO.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        stringBuffer.append("{");
        int iMo80632c = mo80632c();
        for (int i = 0; i < iMo80632c; i++) {
            stringBuffer.append("{");
            for (int i2 = 0; i2 < mo80628a(); i2++) {
                if (i2 > 0) {
                    stringBuffer.append(",");
                }
                C28195OoooOOo.OooO00o(mo80627a(i, i2), (NumberFormat) c24037Oooo0OO.f80945OooO00o, stringBuffer, fieldPosition);
            }
            stringBuffer.append("}");
            if (i < iMo80632c - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("}");
        sb.append(stringBuffer.toString());
        return sb.toString();
    }

    public AbstractC33146OooO00o(int i, int i2) {
        if (i < 1) {
            throw new C24923OooO0oo(Integer.valueOf(i));
        }
        if (i2 < 1) {
            throw new C24923OooO0oo(Integer.valueOf(i2));
        }
    }

    @Override // oO0OOooO.InterfaceC33145OooO
    /* JADX INFO: renamed from: a */
    public InterfaceC33145OooO mo80630a(int i) {
        C33152OooO0oO.OooO0O0(this, i);
        int iMo80632c = mo80632c();
        InterfaceC33145OooO interfaceC33145OooOOoooO00 = OoooO00(iMo80632c, 1);
        for (int i2 = 0; i2 < iMo80632c; i2++) {
            interfaceC33145OooOOoooO00.OooO00o(mo80627a(i2, i), i2, 0);
        }
        return interfaceC33145OooOOoooO00;
    }
}
