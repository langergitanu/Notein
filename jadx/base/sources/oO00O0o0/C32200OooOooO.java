package oO00O0o0;

import OooOooo.C20798OoooOOo;
import OoooOOo.C21197OooOO0O;
import com.huawei.agconnect.credential.Server;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00oo0O0.C25679OooOo0o;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: oO00O0o0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32200OooOooO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final C32211OoooO0 f115569OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C32197OooOoOO f115570OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo0 f115571OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f115572OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f115573OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f115574OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f115575OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f115576OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f115577OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<String> f115578OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C32213OoooO0O f115579OooOO0;

    static {
        C32200OooOooO c32200OooOooO = new C32200OooOooO(0);
        C32204Oooo00o.OooO0O0(c32200OooOooO, Server.f52054GW);
        f115569OooOO0O = c32200OooOooO.OooO0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C32200OooOooO(int i) throws Throwable {
        int i2;
        int i3 = 1;
        Oooo0 protocol = Oooo0.f115581OooO0OO;
        C34434OooOoO<String> c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        InterfaceC32195OooOoO.f115567OooO0O0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(protocol, "protocol");
        this.f115571OooO00o = protocol;
        this.f115572OooO0O0 = "";
        int i4 = 0;
        this.f115573OooO0OO = 0;
        this.f115574OooO0Oo = false;
        this.f115576OooO0o0 = null;
        this.f115575OooO0o = null;
        Set<Byte> set = OooO0O0.f115511OooO00o;
        Charset charset = C33580OooO00o.f121231OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
        OooO0O0.OooO0oO(C25679OooOo0o.OooO0O0(charsetEncoderNewEncoder, "", 0, 0), new OooO0OO(sb));
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        this.f115577OooO0oO = string;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
        for (String str : c34434OooOoO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
            StringBuilder sb2 = new StringBuilder();
            Charset charset2 = C33580OooO00o.f121231OooO0O0;
            int i5 = i4;
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if (!OooO0O0.f115512OooO0O0.contains(Character.valueOf(cCharAt))) {
                    if (OooO0O0.f115516OooO0o0.contains(Character.valueOf(cCharAt))) {
                        sb2.append(cCharAt);
                        i5++;
                    } else if (cCharAt != '%' || (i2 = i5 + 2) >= str.length()) {
                        int i6 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                        CharsetEncoder charsetEncoderNewEncoder2 = charset2.newEncoder();
                        kotlin.jvm.internal.OooOOO0.OooO0o(charsetEncoderNewEncoder2, "charset.newEncoder()");
                        int i7 = i6 + i5;
                        OooO0O0.OooO0oO(C25679OooOo0o.OooO0O0(charsetEncoderNewEncoder2, str, i5, i7), new C20798OoooOOo(sb2, i3));
                        i5 = i7;
                    } else {
                        int i8 = i5 + 1;
                        Character chValueOf = Character.valueOf(str.charAt(i8));
                        Set<Character> set2 = OooO0O0.f115513OooO0OO;
                        if (set2.contains(chValueOf) && set2.contains(Character.valueOf(str.charAt(i2)))) {
                            sb2.append(cCharAt);
                            sb2.append(str.charAt(i8));
                            sb2.append(str.charAt(i2));
                            i5 += 3;
                        }
                    }
                }
            }
            String string2 = sb2.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(string2);
            i4 = 0;
        }
        this.f115578OooO0oo = arrayList;
        C32197OooOoOO c32197OooOoOO = new C32197OooOoOO();
        for (String name : C34438OooOoo0.f123458OooOo0o) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            String strOooO0o = OooO0O0.OooO0o(name, false);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(c34434OooOoO, 10));
            for (String str2 : c34434OooOoO) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(str2, "<this>");
                arrayList2.add(OooO0O0.OooO0o(str2, true));
            }
            c32197OooOoOO.OooO00o(strOooO0o, arrayList2);
        }
        this.f115570OooO = c32197OooOoOO;
        this.f115579OooOO0 = new C32213OoooO0O(c32197OooOoOO);
    }

    public final void OooO00o() {
        if (this.f115572OooO0O0.length() <= 0 && !kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115571OooO00o.f115583OooO00o, "file")) {
            C32211OoooO0 c32211OoooO0 = f115569OooOO0O;
            this.f115572OooO0O0 = c32211OoooO0.f115595OooO0O0;
            Oooo0 oooo0 = this.f115571OooO00o;
            Oooo0 oooo02 = Oooo0.f115581OooO0OO;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooo0, Oooo0.f115581OooO0OO)) {
                this.f115571OooO00o = c32211OoooO0.f115594OooO00o;
            }
            if (this.f115573OooO0OO == 0) {
                this.f115573OooO0OO = c32211OoooO0.f115596OooO0OO;
            }
        }
    }

    public final C32211OoooO0 OooO0O0() {
        OooO00o();
        Oooo0 oooo0 = this.f115571OooO00o;
        String str = this.f115572OooO0O0;
        int i = this.f115573OooO0OO;
        List<String> list = this.f115578OooO0oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO0O0.OooO0Oo((String) it.next()));
        }
        InterfaceC32195OooOoO interfaceC32195OooOoOOooO0OO = C21197OooOO0O.OooO0OO(this.f115579OooOO0.f115609OooO00o);
        String strOooO0o0 = OooO0O0.OooO0o0(0, 0, 15, this.f115577OooO0oO);
        String str2 = this.f115576OooO0o0;
        String strOooO0Oo = str2 != null ? OooO0O0.OooO0Oo(str2) : null;
        String str3 = this.f115575OooO0o;
        String strOooO0Oo2 = str3 != null ? OooO0O0.OooO0Oo(str3) : null;
        boolean z = this.f115574OooO0Oo;
        OooO00o();
        StringBuilder sb = new StringBuilder(256);
        OoooO0O.OooOo.OooO0o(this, sb);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "appendTo(StringBuilder(256)).toString()");
        return new C32211OoooO0(oooo0, str, i, arrayList, interfaceC32195OooOoOOooO0OO, strOooO0o0, strOooO0Oo, strOooO0Oo2, z, string);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(256);
        OoooO0O.OooOo.OooO0o(this, sb);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }
}
