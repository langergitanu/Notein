package androidx.ink.storage;

import androidx.ink.strokes.OooOOO;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Landroidx/ink/storage/StrokeInputBatchSerialization;", "", "<init>", "()V", "Landroidx/ink/strokes/OooOOO;", "strokeInputBatch", "Ljava/io/OutputStream;", "output", "LoO00ooO/OooOooO;", "encode", "(Landroidx/ink/strokes/OooOOO;Ljava/io/OutputStream;)V", "", "(Landroidx/ink/strokes/OooOOO;)[B", "Ljava/io/InputStream;", "input", "Landroidx/ink/strokes/OooO00o;", "decode", "(Ljava/io/InputStream;)Landroidx/ink/strokes/OooO00o;", "([B)Landroidx/ink/strokes/OooO00o;", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeInputBatchSerialization {
    public static final StrokeInputBatchSerialization INSTANCE = new StrokeInputBatchSerialization();

    private StrokeInputBatchSerialization() {
    }

    public static final androidx.ink.strokes.OooO00o decode(InputStream input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return StrokeInputBatchExtensions.decode(OooOOO.f65481OooO0O0, input);
    }

    public static final void encode(OooOOO strokeInputBatch, OutputStream output) throws IOException {
        OooOOO0.OooO0oO(strokeInputBatch, "strokeInputBatch");
        OooOOO0.OooO0oO(output, "output");
        StrokeInputBatchExtensions.encode(strokeInputBatch, output);
    }

    public static final androidx.ink.strokes.OooO00o decode(byte[] input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return StrokeInputBatchExtensions.decode(OooOOO.f65481OooO0O0, input);
    }

    public static final byte[] encode(OooOOO strokeInputBatch) {
        OooOOO0.OooO0oO(strokeInputBatch, "strokeInputBatch");
        return StrokeInputBatchExtensions.encode(strokeInputBatch);
    }
}
