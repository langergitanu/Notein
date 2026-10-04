package oO00O;

import Oooo0.o0OoOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO00Oo0.C32266OooO0Oo;
import oO0O0OOO.C32652OooO0oO;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: oO00O.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32167OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f115392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<C32652OooO0oO> f115393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32139OooO0Oo f115394OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f115395OooO0Oo;

    /* JADX INFO: renamed from: oO00O.OoooO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f115396OooO00o;

        static {
            int[] iArr = new int[o0OoOo0.OooO0O0(9).length];
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f115396OooO00o = iArr;
        }
    }

    public C32167OoooO(EnumC32175OoooOoO version, byte[] bArr, byte[] bArr2, short s, List extensions) throws C32166Oooo0oo {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(version, "version");
        kotlin.jvm.internal.OooOOO0.OooO0oO(extensions, "extensions");
        this.f115392OooO00o = bArr;
        this.f115393OooO0O0 = extensions;
        Iterator it = oO00O.OooO00o.f115244OooO00o.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((C32139OooO0Oo) next).f115246OooO00o == s) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C32139OooO0Oo c32139OooO0Oo = (C32139OooO0Oo) next;
        if (c32139OooO0Oo == null) {
            throw new IllegalStateException(("Server cipher suite is not supported: " + ((int) s)).toString());
        }
        this.f115394OooO0OO = c32139OooO0Oo;
        ArrayList arrayList = new ArrayList();
        for (C32652OooO0oO c32652OooO0oO : this.f115393OooO0O0) {
            if (OooO00o.f115396OooO00o[o0OoOo0.OooO00o(c32652OooO0oO.f117326OooO00o)] == 1) {
                List<oO0O0OOO.OooO00o> list = oO0O0OOO.OooO0o.f117324OooO00o;
                C32266OooO0Oo c32266OooO0Oo = c32652OooO0oO.f117327OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
                int iOooO0Oo = io.ktor.utils.p616io.internal.OooOO0O.OooO0Oo(c32266OooO0Oo) & 65535;
                ArrayList arrayList2 = new ArrayList();
                while (c32266OooO0Oo.Oooo0() > 0) {
                    oO0O0OOO.OooO00o OooO00o2 = oO0O0OOO.OooO0o.OooO00o(c32266OooO0Oo.readByte(), c32266OooO0Oo.readByte());
                    if (OooO00o2 != null) {
                        arrayList2.add(OooO00o2);
                    }
                }
                if (((int) c32266OooO0Oo.Oooo0()) != iOooO0Oo) {
                    StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO0Oo, "Invalid hash and sign packet size: expected ", ", actual ");
                    sbOooO0OO.append(arrayList2.size());
                    throw new C32166Oooo0oo(sbOooO0OO.toString(), 0);
                }
                C34431OooOo0.OooOo0o(arrayList, arrayList2);
            }
        }
        this.f115395OooO0Oo = arrayList;
    }
}
