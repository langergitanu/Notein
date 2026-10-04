package androidx.ink.storage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000*\n\u0010\u0002\"\u00020\u00032\u00020\u0003¨\u0006\u0004"}, m80612d2 = {"compress", "", "IOException", "Ljava/io/IOException;", "ink-storage"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ByteArrays_jvmAndAndroidKt {
    public static /* synthetic */ void IOException$annotations() {
    }

    public static final byte[] compress(byte[] bArr) throws IOException {
        OooOOO0.OooO0oO(bArr, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                OooOOO0.OooO0o(byteArray, "use(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }
}
