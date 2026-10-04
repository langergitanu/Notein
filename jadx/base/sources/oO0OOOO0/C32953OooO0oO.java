package oO0OOOO0;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32953OooO0oO.OooO00o;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO;

/* JADX INFO: renamed from: oO0OOOO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32953OooO0oO<FieldDescriptorType extends OooO00o<FieldDescriptorType>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32953OooO0oO f119077OooO0Oo = new C32953OooO0oO(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f119079OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f119080OooO0OO = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f119078OooO00o = new OooOo00(16);

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oO$OooO00o */
    public interface OooO00o<T extends OooO00o<T>> extends Comparable<T> {
        EnumC32967OooOoO0 getLiteJavaType();

        OooOo getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        AbstractC32954OooO0oo.OooO00o ooOO(InterfaceC32958OooOOOo.OooO00o oooO00o, InterfaceC32958OooOOOo interfaceC32958OooOOOo);
    }

    public C32953OooO0oO() {
    }

    public static Object OooO(C32951OooO0Oo c32951OooO0Oo, OooOo oooOo) throws IOException {
        switch (oooOo.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c32951OooO0Oo.OooOO0()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c32951OooO0Oo.OooO()));
            case 2:
                return Long.valueOf(c32951OooO0Oo.OooOO0o());
            case 3:
                return Long.valueOf(c32951OooO0Oo.OooOO0o());
            case 4:
                return Integer.valueOf(c32951OooO0Oo.OooOO0O());
            case 5:
                return Long.valueOf(c32951OooO0Oo.OooOO0());
            case 6:
                return Integer.valueOf(c32951OooO0Oo.OooO());
            case 7:
                return Boolean.valueOf(c32951OooO0Oo.OooOO0o() != 0);
            case 8:
                int iOooOO0O = c32951OooO0Oo.OooOO0O();
                int i = c32951OooO0Oo.f119062OooO0O0;
                int i2 = c32951OooO0Oo.f119064OooO0Oo;
                if (iOooOO0O > i - i2 || iOooOO0O <= 0) {
                    return iOooOO0O == 0 ? "" : new String(c32951OooO0Oo.OooO0oo(iOooOO0O), "UTF-8");
                }
                String str = new String(c32951OooO0Oo.f119061OooO00o, i2, iOooOO0O, "UTF-8");
                c32951OooO0Oo.f119064OooO0Oo += iOooOO0O;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c32951OooO0Oo.OooO0o0();
            case 12:
                return Integer.valueOf(c32951OooO0Oo.OooOO0O());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c32951OooO0Oo.OooO());
            case 15:
                return Long.valueOf(c32951OooO0Oo.OooOO0());
            case 16:
                int iOooOO0O2 = c32951OooO0Oo.OooOO0O();
                return Integer.valueOf((-(iOooOO0O2 & 1)) ^ (iOooOO0O2 >>> 1));
            case 17:
                long jOooOO0o = c32951OooO0Oo.OooOO0o();
                return Long.valueOf((-(jOooOO0o & 1)) ^ (jOooOO0o >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int OooO0OO(OooOo oooOo, Object obj) {
        int serializedSize;
        int iOooO0o;
        switch (oooOo.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C32952OooO0o0.OooO0oO(((Long) obj).longValue());
            case 3:
                return C32952OooO0o0.OooO0oO(((Long) obj).longValue());
            case 4:
                return C32952OooO0o0.OooO0OO(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C32952OooO0o0.OooO0o(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((InterfaceC32958OooOOOo) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof OooOO0O)) {
                    return C32952OooO0o0.OooO0o0((InterfaceC32958OooOOOo) obj);
                }
                OooOO0O oooOO0O = (OooOO0O) obj;
                oooOO0O.getClass();
                serializedSize = oooOO0O.f119098OooO00o.getSerializedSize();
                iOooO0o = C32952OooO0o0.OooO0o(serializedSize);
                break;
                break;
            case 11:
                if (!(obj instanceof OooO0OO)) {
                    byte[] bArr = (byte[]) obj;
                    return C32952OooO0o0.OooO0o(bArr.length) + bArr.length;
                }
                OooO0OO oooO0OO = (OooO0OO) obj;
                serializedSize = C32952OooO0o0.OooO0o(oooO0OO.size());
                iOooO0o = oooO0OO.size();
                break;
                break;
            case 12:
                return C32952OooO0o0.OooO0o(((Integer) obj).intValue());
            case 13:
                return obj instanceof OooO.OooO00o ? C32952OooO0o0.OooO0OO(((OooO.OooO00o) obj).getNumber()) : C32952OooO0o0.OooO0OO(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return C32952OooO0o0.OooO0o((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return C32952OooO0o0.OooO0oO((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iOooO0o + serializedSize;
    }

    public static int OooO0Oo(OooO00o<?> oooO00o, Object obj) {
        int iOooO0oo;
        int iOooO0OO;
        OooOo liteType = oooO00o.getLiteType();
        int number = oooO00o.getNumber();
        if (oooO00o.isRepeated()) {
            int iOooO0OO2 = 0;
            if (!oooO00o.isPacked()) {
                for (Object obj2 : (List) obj) {
                    int iOooO0oo2 = C32952OooO0o0.OooO0oo(number);
                    if (liteType == OooOo.f119121OooOoOO) {
                        iOooO0oo2 *= 2;
                    }
                    iOooO0OO2 += OooO0OO(liteType, obj2) + iOooO0oo2;
                }
                return iOooO0OO2;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iOooO0OO2 += OooO0OO(liteType, it.next());
            }
            iOooO0oo = C32952OooO0o0.OooO0oo(number) + iOooO0OO2;
            iOooO0OO = C32952OooO0o0.OooO0o(iOooO0OO2);
        } else {
            iOooO0oo = C32952OooO0o0.OooO0oo(number);
            if (liteType == OooOo.f119121OooOoOO) {
                iOooO0oo *= 2;
            }
            iOooO0OO = OooO0OO(liteType, obj);
        }
        return iOooO0OO + iOooO0oo;
    }

    public static boolean OooO0o(Map.Entry entry) {
        OooO00o oooO00o = (OooO00o) entry.getKey();
        if (oooO00o.getLiteJavaType() != EnumC32967OooOoO0.MESSAGE) {
            return true;
        }
        if (oooO00o.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((InterfaceC32958OooOOOo) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof InterfaceC32958OooOOOo) {
            return ((InterfaceC32958OooOOOo) value).isInitialized();
        }
        if (value instanceof OooOO0O) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooOO0O(OooOo oooOo, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (oooOo.f119126OooOo0o) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof OooO0OO) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof OooO.OooO00o)) {
                }
                z2 = z;
                break;
            case MESSAGE:
                if (!(obj instanceof InterfaceC32958OooOOOo) && !(obj instanceof OooOO0O)) {
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void OooOO0o(C32952OooO0o0 c32952OooO0o0, OooOo oooOo, int i, Object obj) throws IOException {
        if (oooOo == OooOo.f119121OooOoOO) {
            c32952OooO0o0.OooOo(i, 3);
            ((InterfaceC32958OooOOOo) obj).OooO00o(c32952OooO0o0);
            c32952OooO0o0.OooOo(i, 4);
        }
        c32952OooO0o0.OooOo(i, oooOo.f119125OooOo);
        switch (oooOo.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                c32952OooO0o0.getClass();
                c32952OooO0o0.OooOo0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                c32952OooO0o0.getClass();
                c32952OooO0o0.OooOo00(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                c32952OooO0o0.OooOo0o(((Long) obj).longValue());
                break;
            case 3:
                c32952OooO0o0.OooOo0o(((Long) obj).longValue());
                break;
            case 4:
                c32952OooO0o0.OooOOO(((Integer) obj).intValue());
                break;
            case 5:
                c32952OooO0o0.OooOo0(((Long) obj).longValue());
                break;
            case 6:
                c32952OooO0o0.OooOo00(((Integer) obj).intValue());
                break;
            case 7:
                c32952OooO0o0.OooOOo0(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                c32952OooO0o0.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c32952OooO0o0.OooOo0O(bytes.length);
                c32952OooO0o0.OooOOoo(bytes);
                break;
            case 9:
                c32952OooO0o0.getClass();
                ((InterfaceC32958OooOOOo) obj).OooO00o(c32952OooO0o0);
                break;
            case 10:
                c32952OooO0o0.OooOOOo((InterfaceC32958OooOOOo) obj);
                break;
            case 11:
                if (!(obj instanceof OooO0OO)) {
                    byte[] bArr = (byte[]) obj;
                    c32952OooO0o0.getClass();
                    c32952OooO0o0.OooOo0O(bArr.length);
                    c32952OooO0o0.OooOOoo(bArr);
                } else {
                    OooO0OO oooO0OO = (OooO0OO) obj;
                    c32952OooO0o0.getClass();
                    c32952OooO0o0.OooOo0O(oooO0OO.size());
                    c32952OooO0o0.OooOOo(oooO0OO);
                }
                break;
            case 12:
                c32952OooO0o0.OooOo0O(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof OooO.OooO00o)) {
                    c32952OooO0o0.OooOOO(((Integer) obj).intValue());
                } else {
                    c32952OooO0o0.OooOOO(((OooO.OooO00o) obj).getNumber());
                }
                break;
            case 14:
                c32952OooO0o0.OooOo00(((Integer) obj).intValue());
                break;
            case 15:
                c32952OooO0o0.OooOo0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c32952OooO0o0.OooOo0O((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c32952OooO0o0.OooOo0o((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void OooO00o(AbstractC32954OooO0oo.C32955OooO0Oo c32955OooO0Oo, Object obj) {
        List arrayList;
        if (!c32955OooO0Oo.f119089OooOoO0) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        OooOO0O(c32955OooO0Oo.f119087OooOo, obj);
        Object objOooO0o0 = OooO0o0(c32955OooO0Oo);
        if (objOooO0o0 == null) {
            arrayList = new ArrayList();
            this.f119078OooO00o.OooO0o(c32955OooO0Oo, arrayList);
        } else {
            arrayList = (List) objOooO0o0;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final C32953OooO0oO<FieldDescriptorType> clone() {
        OooOo00 oooOo00;
        C32953OooO0oO<FieldDescriptorType> c32953OooO0oO = new C32953OooO0oO<>();
        int i = 0;
        while (true) {
            oooOo00 = this.f119078OooO00o;
            if (i >= oooOo00.f119128OooOo.size()) {
                break;
            }
            C32963OooOo0<K, V>.OooO0O0 oooO0O0 = oooOo00.f119128OooOo.get(i);
            c32953OooO0oO.OooOO0((OooO00o) oooO0O0.getKey(), oooO0O0.getValue());
            i++;
        }
        for (Map.Entry<Object, Object> entry : oooOo00.OooO0Oo()) {
            c32953OooO0oO.OooOO0((OooO00o) entry.getKey(), entry.getValue());
        }
        c32953OooO0oO.f119080OooO0OO = this.f119080OooO0OO;
        return c32953OooO0oO;
    }

    public final Object OooO0o0(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f119078OooO00o.get(fielddescriptortype);
        return obj instanceof OooOO0O ? ((OooOO0O) obj).OooO00o() : obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    public final void OooO0oO() {
        if (this.f119079OooO0O0) {
            return;
        }
        OooOo00 oooOo00 = this.f119078OooO00o;
        if (!oooOo00.f119130OooOoO) {
            for (int i = 0; i < oooOo00.f119128OooOo.size(); i++) {
                C32963OooOo0<K, V>.OooO0O0 oooO0O0 = oooOo00.f119128OooOo.get(i);
                if (((OooO00o) oooO0O0.getKey()).isRepeated()) {
                    oooO0O0.setValue(Collections.unmodifiableList((List) oooO0O0.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : oooOo00.OooO0Oo()) {
                if (((OooO00o) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!oooOo00.f119130OooOoO) {
            oooOo00.f119131OooOoO0 = oooOo00.f119131OooOoO0.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oooOo00.f119131OooOoO0);
            oooOo00.f119130OooOoO = true;
        }
        this.f119079OooO0O0 = true;
    }

    public final void OooO0oo(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof OooOO0O) {
            value = ((OooOO0O) value).OooO00o();
        }
        boolean zIsRepeated = key.isRepeated();
        OooOo00 oooOo00 = this.f119078OooO00o;
        if (zIsRepeated) {
            Object objOooO0o0 = OooO0o0(key);
            if (objOooO0o0 == null) {
                objOooO0o0 = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objOooO0o0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            oooOo00.OooO0o(key, objOooO0o0);
            return;
        }
        if (key.getLiteJavaType() != EnumC32967OooOoO0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            oooOo00.OooO0o(key, value);
            return;
        }
        Object objOooO0o02 = OooO0o0(key);
        if (objOooO0o02 != null) {
            oooOo00.OooO0o(key, key.ooOO(((InterfaceC32958OooOOOo) objOooO0o02).toBuilder(), (InterfaceC32958OooOOOo) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        oooOo00.OooO0o(key, value);
    }

    public final void OooOO0(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            OooOO0O(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OooOO0O(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof OooOO0O) {
            this.f119080OooO0OO = true;
        }
        this.f119078OooO00o.OooO0o(fielddescriptortype, obj);
    }

    public C32953OooO0oO(int i) {
        OooO0oO();
    }
}
