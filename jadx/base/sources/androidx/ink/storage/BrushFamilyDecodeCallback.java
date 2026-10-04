package androidx.ink.storage;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m80612d2 = {"Landroidx/ink/storage/BrushFamilyDecodeCallback;", "", "onDecodeTexture", "", "clientTextureId", "bitmap", "Landroid/graphics/Bitmap;", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface BrushFamilyDecodeCallback {
    String onDecodeTexture(String clientTextureId, Bitmap bitmap);
}
