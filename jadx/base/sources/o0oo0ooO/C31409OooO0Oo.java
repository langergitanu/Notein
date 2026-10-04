package o0oo0ooO;

import android.graphics.Path;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o0000o0O.AbstractC24304ooOO;
import o0oo0o0O.InterfaceC31321OooO00o;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0oO0.C31351OooOOo;
import o0oo0oO0.C31352OooOOo0;
import o0oo0oo0.C31405OooO00o;
import o0oo0ooo.C31412OooO00o;

/* JADX INFO: renamed from: o0oo0ooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31409OooO0Oo implements InterfaceC31408OooO0OO, InterfaceC31321OooO00o, InterfaceC31322OooO0O0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final LinkedHashMap f112157OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f112158OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ConcurrentHashMap f112159OooOooO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f112153OooOo0o = "";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC24304ooOO f112152OooOo = null;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f112155OooOoO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f112154OooOoO = new ArrayList();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f112156OooOoOO = "";

    public C31409OooO0Oo() {
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        this.f112158OooOoo0 = new ArrayList();
        this.f112157OooOoo = new LinkedHashMap();
        this.f112159OooOooO = new ConcurrentHashMap();
    }

    public static C31409OooO0Oo OooO0o(byte[] bArr) throws IOException {
        C31405OooO00o c31405OooO00o = new C31405OooO00o();
        c31405OooO00o.OooO00o(bArr);
        C31410OooO0o c31410OooO0o = new C31410OooO0o();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(c31405OooO00o.f112134OooO00o, 0, c31405OooO00o.f112135OooO0O0[0]);
        byte[] bArr2 = c31405OooO00o.f112134OooO00o;
        int[] iArr = c31405OooO00o.f112135OooO0O0;
        int i = iArr[0];
        return c31410OooO0o.OooO0OO(bArrCopyOfRange, Arrays.copyOfRange(bArr2, i, iArr[1] + i));
    }

    public static C31409OooO0Oo OooO0o0(FileInputStream fileInputStream) throws IOException {
        C31405OooO00o c31405OooO00o = new C31405OooO00o();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                c31405OooO00o.OooO00o(byteArrayOutputStream.toByteArray());
                C31410OooO0o c31410OooO0o = new C31410OooO0o();
                byte[] bArrCopyOfRange = Arrays.copyOfRange(c31405OooO00o.f112134OooO00o, 0, c31405OooO00o.f112135OooO0O0[0]);
                byte[] bArr2 = c31405OooO00o.f112134OooO00o;
                int[] iArr = c31405OooO00o.f112135OooO0O0;
                int i2 = iArr[0];
                return c31410OooO0o.OooO0OO(bArrCopyOfRange, Arrays.copyOfRange(bArr2, i2, iArr[1] + i2));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final List<Number> OooO00o() {
        return Collections.unmodifiableList(this.f112155OooOoO0);
    }

    @Override // o0oo0o0O.InterfaceC31321OooO00o
    public final AbstractC24304ooOO OooO0O0() {
        return this.f112152OooOo;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final C31412OooO00o OooO0OO() {
        return new C31412OooO00o(this.f112154OooOoO);
    }

    @Override // o0oo0ooO.InterfaceC31408OooO0OO
    public final C31352OooOOo0 OooO0Oo(String str) throws IOException {
        ConcurrentHashMap concurrentHashMap = this.f112159OooOooO;
        C31352OooOOo0 c31352OooOOo0 = (C31352OooOOo0) concurrentHashMap.get(str);
        if (c31352OooOOo0 != null) {
            return c31352OooOOo0;
        }
        LinkedHashMap linkedHashMap = this.f112157OooOoo;
        byte[] bArr = (byte[]) linkedHashMap.get(str);
        if (bArr == null) {
            bArr = (byte[]) linkedHashMap.get(".notdef");
        }
        C31351OooOOo c31351OooOOo = new C31351OooOOo(this.f112153OooOo0o, str);
        ArrayList arrayList = this.f112158OooOoo0;
        ArrayList arrayList2 = new ArrayList();
        c31351OooOOo.OooO00o(bArr, arrayList, arrayList2);
        C31352OooOOo0 c31352OooOOo02 = new C31352OooOOo0(this, this.f112153OooOo0o, str);
        c31352OooOOo02.f111954OooOO0 = arrayList2;
        concurrentHashMap.put(str, c31352OooOOo02);
        return c31352OooOOo02;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final Path OooOOO0(String str) throws IOException {
        return OooO0Oo(str).OooO00o();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final boolean OooOOo0(String str) {
        return this.f112157OooOoo.get(str) != null;
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final float OooOOoo(String str) throws IOException {
        return OooO0Oo(str).OooO0O0();
    }

    @Override // o0oo0o0O.InterfaceC31322OooO0O0
    public final String getName() {
        return this.f112153OooOo0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C31409OooO0Oo.class, sb, "[fontName=");
        sb.append(this.f112153OooOo0o);
        sb.append(", fullName=");
        sb.append(this.f112156OooOoOO);
        sb.append(", encoding=");
        sb.append(this.f112152OooOo);
        sb.append(", charStringsDict=");
        sb.append(this.f112157OooOoo);
        sb.append("]");
        return sb.toString();
    }
}
