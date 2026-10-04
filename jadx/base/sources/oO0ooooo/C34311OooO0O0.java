package oO0ooooo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34075o00o0O;
import oO0oOOOO.C34116OooO0o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oooO.C34280OooO;
import oO0oooO.C34281OooO00o;
import oO0oooO.C34288OooO0oo;
import oO0oooO.C34289OooOO0;
import oO0oooO.C34290OooOO0O;
import oO0oooO.C34293OooOOO0;
import oO0oooO.InterfaceC34286OooO0o0;
import oO0oooOO.C34296OooO;
import oO0oooOO.C34299OooO0OO;
import oO0oooOO.C34304OooO0oo;
import oO0oooOo.C34307OooO00o;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34416OooO00o;
import oOo00o00.C34550OooO0O0;
import oOo00oo0.C34564OooO0O0;
import p619oO.C31898OooOOo;
import p619oO.C31900OooOOoo;
import p619oO.C31903OooOo0o;
import p619oO.C31904OooOoO;
import p619oO.OooOo;

/* JADX INFO: renamed from: oO0ooooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34311OooO0O0 {
    public static C34116OooO0o OooO00o(oO0000oo.OooO0OO oooO0OO, AbstractC34040OooOooo abstractC34040OooOooo) throws IOException {
        C34296OooO c34296OooOOooO0oO;
        if (oooO0OO instanceof C34416OooO00o) {
            C34416OooO00o c34416OooO00o = (C34416OooO00o) oooO0OO;
            return new C34116OooO0o(C34317OooO0o0.OooO0Oo(c34416OooO00o.f123428OooOo), new C34075o00o0O(C34332OooO00o.OooO00o(c34416OooO00o.f123429OooOoO0)), abstractC34040OooOooo, null);
        }
        if (oooO0OO instanceof C34550OooO0O0) {
            C34550OooO0O0 c34550OooO0O0 = (C34550OooO0O0) oooO0OO;
            return new C34116OooO0o(new C34142OooO00o(InterfaceC34286OooO0o0.f123094OooO0Oo, new C34288OooO0oo(C34317OooO0o0.OooO0o0(c34550OooO0O0.f123790OooOo))), new C34075o00o0O(C34332OooO00o.OooO00o(c34550OooO0O0.f123791OooOoO0)), null, null);
        }
        if (oooO0OO instanceof C34307OooO00o) {
            C34142OooO00o c34142OooO00o = new C34142OooO00o(InterfaceC34286OooO0o0.f123096OooO0o0);
            short[] sArrOooO0O0 = C34332OooO00o.OooO0O0(((C34307OooO00o) oooO0OO).f123175OooOo);
            byte[] bArr = new byte[sArrOooO0O0.length * 2];
            for (int i = 0; i != sArrOooO0O0.length; i++) {
                short s = sArrOooO0O0[i];
                int i2 = i * 2;
                bArr[i2] = (byte) s;
                bArr[i2 + 1] = (byte) (s >>> 8);
            }
            return new C34116OooO0o(c34142OooO00o, new C34075o00o0O(bArr), null, null);
        }
        if (oooO0OO instanceof C34304OooO0oo) {
            C34304OooO0oo c34304OooO0oo = (C34304OooO0oo) oooO0OO;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte b = (byte) 0;
            byteArrayOutputStream.write(b);
            byte b2 = (byte) 0;
            byteArrayOutputStream.write(b2);
            byte b3 = (byte) 0;
            byteArrayOutputStream.write(b3);
            byte b4 = (byte) 1;
            byteArrayOutputStream.write(b4);
            try {
                byteArrayOutputStream.write(c34304OooO0oo.getEncoded());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(b);
                byteArrayOutputStream2.write(b2);
                byteArrayOutputStream2.write(b3);
                byteArrayOutputStream2.write(b4);
                try {
                    byteArrayOutputStream2.write(c34304OooO0oo.OooO0oO().getEncoded());
                    return new C34116OooO0o(new C34142OooO00o(InterfaceC34117OooO0o0.f122611OooOo0O), new C34075o00o0O(byteArray), abstractC34040OooOooo, byteArrayOutputStream2.toByteArray());
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage(), e);
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        }
        if (oooO0OO instanceof C34299OooO0OO) {
            C34299OooO0OO c34299OooO0OO = (C34299OooO0OO) oooO0OO;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i3 = c34299OooO0OO.f123138OooOo;
            byteArrayOutputStream3.write((byte) (i3 >>> 24));
            byteArrayOutputStream3.write((byte) (i3 >>> 16));
            byteArrayOutputStream3.write((byte) (i3 >>> 8));
            byteArrayOutputStream3.write((byte) i3);
            try {
                byteArrayOutputStream3.write(c34299OooO0OO.getEncoded());
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i4 = c34299OooO0OO.f123138OooOo;
                byteArrayOutputStream4.write((byte) (i4 >>> 24));
                byteArrayOutputStream4.write((byte) (i4 >>> 16));
                byteArrayOutputStream4.write((byte) (i4 >>> 8));
                byteArrayOutputStream4.write((byte) i4);
                synchronized (c34299OooO0OO) {
                    c34296OooOOooO0oO = c34299OooO0OO.f123139OooOoO.get(0).OooO0oO();
                }
                try {
                    byteArrayOutputStream4.write(c34296OooOOooO0oO.getEncoded());
                    return new C34116OooO0o(new C34142OooO00o(InterfaceC34117OooO0o0.f122611OooOo0O), new C34075o00o0O(byteArray2), abstractC34040OooOooo, byteArrayOutputStream4.toByteArray());
                } catch (Exception e3) {
                    throw new RuntimeException(e3.getMessage(), e3);
                }
            } catch (Exception e4) {
                throw new RuntimeException(e4.getMessage(), e4);
            }
        }
        if (oooO0OO instanceof OooOo) {
            OooOo oooOo = (OooOo) oooO0OO;
            C34142OooO00o c34142OooO00o2 = new C34142OooO00o(InterfaceC34286OooO0o0.f123095OooO0o, new C34280OooO(oooOo.f113686OooOoO0.f113711OooO0O0, C34317OooO0o0.OooO0oO(oooOo.f113663OooOo)));
            byte[] encoded = oooOo.getEncoded();
            C31903OooOo0o c31903OooOo0o = oooOo.f113686OooOoO0;
            int i5 = c31903OooOo0o.f113714OooO0o;
            int i6 = c31903OooOo0o.f113711OooO0O0;
            int iOooO00o = (int) C31904OooOoO.OooO00o(4, encoded);
            if (!C31904OooOoO.OooO0oO(i6, iOooO00o)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            byte[] bArrOooO0o = C31904OooOoO.OooO0o(4, i5, encoded);
            int i7 = 4 + i5;
            byte[] bArrOooO0o2 = C31904OooOoO.OooO0o(i7, i5, encoded);
            int i8 = i7 + i5;
            byte[] bArrOooO0o3 = C31904OooOoO.OooO0o(i8, i5, encoded);
            int i9 = i8 + i5;
            byte[] bArrOooO0o4 = C31904OooOoO.OooO0o(i9, i5, encoded);
            int i10 = i9 + i5;
            byte[] bArrOooO0o5 = C31904OooOoO.OooO0o(i10, encoded.length - i10, encoded);
            try {
                int i11 = ((p619oO.OooO00o) C31904OooOoO.OooO0o0(bArrOooO0o5, p619oO.OooO00o.class)).f113615Oooo00O;
                return new C34116OooO0o(c34142OooO00o2, i11 != (1 << i6) - 1 ? new C34293OooOOO0(iOooO00o, bArrOooO0o, bArrOooO0o2, bArrOooO0o3, bArrOooO0o4, bArrOooO0o5, i11) : new C34293OooOOO0(iOooO00o, bArrOooO0o, bArrOooO0o2, bArrOooO0o3, bArrOooO0o4, bArrOooO0o5), abstractC34040OooOooo, null);
            } catch (ClassNotFoundException e5) {
                throw new IOException("cannot parse BDS: " + e5.getMessage());
            }
        }
        if (!(oooO0OO instanceof C31900OooOOoo)) {
            if (!(oooO0OO instanceof C34564OooO0O0)) {
                throw new IOException("key parameters not recognized");
            }
            C34564OooO0O0 c34564OooO0O0 = (C34564OooO0O0) oooO0OO;
            return new C34116OooO0o(new C34142OooO00o(InterfaceC34286OooO0o0.f123093OooO0OO), new C34281OooO00o(c34564OooO0O0.f123811OooOoO0, c34564OooO0O0.f123810OooOoO, c34564OooO0O0.f123812OooOoOO, c34564OooO0O0.f123814OooOoo0, c34564OooO0O0.f123813OooOoo, C34317OooO0o0.OooO00o(c34564OooO0O0.f123809OooOo)), null, null);
        }
        C31900OooOOoo c31900OooOOoo = (C31900OooOOoo) oooO0OO;
        C34032OooOo0O c34032OooOo0O = InterfaceC34286OooO0o0.f123097OooO0oO;
        C31898OooOOo c31898OooOOo = c31900OooOOoo.f113671OooOoO0;
        C34142OooO00o c34142OooO00o3 = new C34142OooO00o(c34032OooOo0O, new C34289OooOO0(c31898OooOOo.f113667OooO0OO, c31898OooOOo.f113668OooO0Oo, C34317OooO0o0.OooO0oO(c31900OooOOoo.f113669OooOo)));
        byte[] encoded2 = c31900OooOOoo.getEncoded();
        C31898OooOOo c31898OooOOo2 = c31900OooOOoo.f113671OooOoO0;
        int i12 = c31898OooOOo2.f113666OooO0O0.f113714OooO0o;
        int i13 = c31898OooOOo2.f113667OooO0OO;
        int i14 = (i13 + 7) / 8;
        long jOooO00o = (int) C31904OooOoO.OooO00o(i14, encoded2);
        if (!C31904OooOoO.OooO0oO(i13, jOooO00o)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] bArrOooO0o6 = C31904OooOoO.OooO0o(i14, i12, encoded2);
        int i15 = i14 + i12;
        byte[] bArrOooO0o7 = C31904OooOoO.OooO0o(i15, i12, encoded2);
        int i16 = i15 + i12;
        byte[] bArrOooO0o8 = C31904OooOoO.OooO0o(i16, i12, encoded2);
        int i17 = i16 + i12;
        byte[] bArrOooO0o9 = C31904OooOoO.OooO0o(i17, i12, encoded2);
        int i18 = i17 + i12;
        byte[] bArrOooO0o10 = C31904OooOoO.OooO0o(i18, encoded2.length - i18, encoded2);
        try {
            long j = ((p619oO.OooO0O0) C31904OooOoO.OooO0o0(bArrOooO0o10, p619oO.OooO0O0.class)).f113616OooOo;
            return new C34116OooO0o(c34142OooO00o3, j != (1 << i13) - 1 ? new C34290OooOO0O(jOooO00o, bArrOooO0o6, bArrOooO0o7, bArrOooO0o8, bArrOooO0o9, bArrOooO0o10, j) : new C34290OooOO0O(jOooO00o, bArrOooO0o6, bArrOooO0o7, bArrOooO0o8, bArrOooO0o9, bArrOooO0o10), abstractC34040OooOooo, null);
        } catch (ClassNotFoundException e6) {
            throw new IOException("cannot parse BDSStateMap: " + e6.getMessage());
        }
    }
}
