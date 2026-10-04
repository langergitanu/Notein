package o0ooO0Oo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import o0ooOO0O.C31607OooO0O0;
import o0ooo000.AbstractC31745OooOO0O;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31450OooOOoo extends AbstractC31434OooO0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final boolean f112479OooOoO0 = Boolean.getBoolean("com.tom_roush.pdfbox.forceParsing");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public byte[] f112480OooOo;

    public C31450OooOOoo(byte[] bArr) {
        this.f112480OooOo = (byte[]) bArr.clone();
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        if (c31607OooO0O0.f112995Oooo0o0) {
            AbstractC31745OooOO0O abstractC31745OooOO0OOooO0O0 = c31607OooO0O0.f112993Oooo0OO.OooOOO0().OooO0O0();
            long j = c31607OooO0O0.f112992Oooo0O0.f112466OooOo0o;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f112480OooOo);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            abstractC31745OooOO0OOooO0O0.OooO0Oo(j, r0.f112465OooOo, byteArrayInputStream, byteArrayOutputStream, false);
            this.f112480OooOo = (byte[]) byteArrayOutputStream.toByteArray().clone();
        }
        C31607OooO0O0.Oooo0(this.f112480OooOo, c31607OooO0O0.f112981OooOoO);
        return null;
    }

    public final String OooOooo() {
        byte[] bArr = this.f112480OooOo;
        if (bArr.length >= 2) {
            byte b = bArr[0];
            if ((b & 255) == 254 && (bArr[1] & 255) == 255) {
                return new String(bArr, 2, bArr.length - 2, C31835OooO00o.f113457OooO0O0);
            }
            if ((b & 255) == 255 && (bArr[1] & 255) == 254) {
                return new String(bArr, 2, bArr.length - 2, C31835OooO00o.f113458OooO0OO);
            }
        }
        int[] iArr = C31451OooOo0.f112481OooO00o;
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i = b2 & 255;
            if (i >= 256) {
                sb.append('?');
            } else {
                sb.append((char) C31451OooOo0.f112481OooO00o[i]);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C31450OooOOoo) && OooOooo().equals(((C31450OooOOoo) obj).OooOooo());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f112480OooOo);
    }

    public final String toString() {
        return "COSString{" + OooOooo() + "}";
    }

    public C31450OooOOoo(String str) {
        for (char c : str.toCharArray()) {
            if (!C31451OooOo0.f112482OooO0O0.containsKey(Character.valueOf(c))) {
                byte[] bytes = str.getBytes(C31835OooO00o.f113457OooO0O0);
                byte[] bArr = new byte[bytes.length + 2];
                this.f112480OooOo = bArr;
                bArr[0] = -2;
                bArr[1] = -1;
                System.arraycopy(bytes, 0, bArr, 2, bytes.length);
                return;
            }
        }
        int[] iArr = C31451OooOo0.f112481OooO00o;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c2 : str.toCharArray()) {
            Integer num = (Integer) C31451OooOo0.f112482OooO0O0.get(Character.valueOf(c2));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        this.f112480OooOo = byteArrayOutputStream.toByteArray();
    }
}
