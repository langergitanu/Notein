package androidx.ink.storage;

import androidx.ink.strokes.OooOOO;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: androidx.ink.storage.StrokeInputBatchExtensions__StrokeInputBatchExtensions_jvmAndAndroidKt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Landroidx/ink/strokes/OooOOO;", "Ljava/io/OutputStream;", "output", "LoO00ooO/OooOooO;", "encode", "(Landroidx/ink/strokes/OooOOO;Ljava/io/OutputStream;)V", "Landroidx/ink/strokes/OooOOO$OooO00o;", "Ljava/io/InputStream;", "input", "Landroidx/ink/strokes/OooO00o;", "decode", "(Landroidx/ink/strokes/OooOOO$OooO00o;Ljava/io/InputStream;)Landroidx/ink/strokes/OooO00o;", "ink-storage"}, m80613k = 5, m80614mv = {2, 1, 0}, m80616xi = 48, m80617xs = "androidx/ink/storage/StrokeInputBatchExtensions")
final /* synthetic */ class C0115x49302f7b {
    public static final androidx.ink.strokes.OooO00o decode(OooOOO.OooO00o oooO00o, InputStream input) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        return StrokeInputBatchExtensions.decodeUncompressed(oooO00o, new DecompressedBytes(input));
    }

    public static final void encode(OooOOO oooOOO, OutputStream output) throws IOException {
        OooOOO0.OooO0oO(oooOOO, "<this>");
        OooOOO0.OooO0oO(output, "output");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(output);
        try {
            gZIPOutputStream.write(StrokeInputBatchExtensions.encodeUncompressed(oooOOO));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            gZIPOutputStream.close();
        } finally {
        }
    }
}
