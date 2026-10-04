package o00OO0o0;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0000OoO.C24224OooO00o;
import oO0O0O0o.OooOO0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.OooO;
import oO0O0OO.OooOO0O;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33336OoooO00;
import oO0Ooo.C33356ooOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o00OO0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24998OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84813OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84814OooO0O0 = 0;

    public static String OooO00o(String str) {
        try {
            System.clearProperty(str);
        } catch (Throwable unused) {
        }
        if (!C24224OooO00o.OooO0O0("")) {
            return "";
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(".SystemConfig"), File.separator, str);
        try {
            if (C24999OooO0OO.OooO00o()) {
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), strOooO0OO);
                if (file.exists()) {
                    file.delete();
                    return "";
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static final AbstractC33320OooOoo OooO0O0(ArrayList arrayList, List list, OooOO0 oooOO02) {
        AbstractC33320OooOoo abstractC33320OooOooOooOO0 = C33356ooOO.OooO0o0(new C33336OoooO00(arrayList)).OooOO0(3, (AbstractC33320OooOoo) OooOo.Oooo0oO(list));
        return abstractC33320OooOooOooOO0 == null ? oooOO02.OooOOO() : abstractC33320OooOooOooOO0;
    }

    public static String OooO0OO(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static final int OooO0Oo(long j, long j2) {
        boolean z = ((int) (j & 4294967295L)) != 0;
        return z != (((int) (4294967295L & j2)) != 0) ? z ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final AbstractC33320OooOoo OooO0o(InterfaceC32637OoooOoo interfaceC32637OoooOoo) {
        OooOOO0.OooO0oO(interfaceC32637OoooOoo, "<this>");
        OooOO0O oooOO0OOooO0Oo = interfaceC32637OoooOoo.OooO0Oo();
        OooOOO0.OooO0o(oooOO0OOooO0Oo, "this.containingDeclaration");
        if (oooOO0OOooO0Oo instanceof OooO) {
            List<InterfaceC32637OoooOoo> parameters = ((OooO) oooOO0OOooO0Oo).OooO().getParameters();
            OooOOO0.OooO0o(parameters, "descriptor.typeConstructor.parameters");
            List<InterfaceC32637OoooOoo> list = parameters;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO = ((InterfaceC32637OoooOoo) it.next()).OooO();
                OooOOO0.OooO0o(interfaceC33342OoooOo0OooO, "it.typeConstructor");
                arrayList.add(interfaceC33342OoooOo0OooO);
            }
            List<AbstractC33320OooOoo> upperBounds = interfaceC32637OoooOoo.getUpperBounds();
            OooOOO0.OooO0o(upperBounds, "upperBounds");
            return OooO0O0(arrayList, upperBounds, C33194OooO0O0.OooO0o0(interfaceC32637OoooOoo));
        }
        if (!(oooOO0OOooO0Oo instanceof InterfaceC32609OooOo0)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<InterfaceC32637OoooOoo> typeParameters = ((InterfaceC32609OooOo0) oooOO0OOooO0Oo).getTypeParameters();
        OooOOO0.OooO0o(typeParameters, "descriptor.typeParameters");
        List<InterfaceC32637OoooOoo> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO2 = ((InterfaceC32637OoooOoo) it2.next()).OooO();
            OooOOO0.OooO0o(interfaceC33342OoooOo0OooO2, "it.typeConstructor");
            arrayList2.add(interfaceC33342OoooOo0OooO2);
        }
        List<AbstractC33320OooOoo> upperBounds2 = interfaceC32637OoooOoo.getUpperBounds();
        OooOOO0.OooO0o(upperBounds2, "upperBounds");
        return OooO0O0(arrayList2, upperBounds2, C33194OooO0O0.OooO0o0(interfaceC32637OoooOoo));
    }

    public static byte[] OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes("UTF-8");
                for (int i = 0; i < length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0x");
                    int i2 = i * 2;
                    sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                    bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e) {
                C24999OooO0OO.OooO0O0("HexUtil", "hex string 2 byte array exception : " + e.getMessage());
                return new byte[0];
            }
        } catch (Throwable th) {
            C24999OooO0OO.OooO0O0("HexUtil", "hex string toUpperCase exception : " + th.getMessage());
            return new byte[0];
        }
    }
}
