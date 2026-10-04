package com.orion.ni_render_engine.impl.ink;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.ink.storage.AndroidBrushFamilySerialization;
import androidx.ink.storage.BrushFamilyDecodeCallback;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18374u4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24485OoooO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\bR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m80612d2 = {"Lcom/orion/ni_render_engine/impl/ink/BrushFamilyProvider;", "", "<init>", "()V", "", "brushFamilyId", "Lo000OO00/OooOOo;", "getCustomBrushFamily", "(Ljava/lang/String;)Lo000OO00/OooOOo;", "brushFamily", "LoO00ooO/OooOooO;", "dumpBrushFamilyFile", "(Lo000OO00/OooOOo;Ljava/lang/String;)V", "Landroid/content/Context;", "context", C18374u4.f56270c, "(Landroid/content/Context;)V", "clientTextureId", "Landroid/graphics/Bitmap;", "getCustomTexture", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "clientBrushFamilyId", "getBrushFamily", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/ConcurrentHashMap;", "TEXTURE_BITMAP_MAP", "Ljava/util/concurrent/ConcurrentHashMap;", "BRUSH_FAMILY_CACHE", "", "MAGIC_NUMBER", "B", "InkBrushFamilyId", "ni-render-engine_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushFamilyProvider {
    private static final byte MAGIC_NUMBER = 93;
    private static Context applicationContext;
    public static final BrushFamilyProvider INSTANCE = new BrushFamilyProvider();
    private static final ConcurrentHashMap<String, Bitmap> TEXTURE_BITMAP_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, C24457OooOOo> BRUSH_FAMILY_CACHE = new ConcurrentHashMap<>();

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/ni_render_engine/impl/ink/BrushFamilyProvider$InkBrushFamilyId;", "", "Companion", "ni-render-engine_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InkBrushFamilyId {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String INK_BALLPOINT_BRUSH_FAMILY_ID_V1 = "notein-ballpoint-v1";
        public static final String INK_FOUNTAIN_BRUSH_FAMILY_ID_V1 = "notein-fountain-v1";
        public static final String INK_FOUNTAIN_BRUSH_FAMILY_ID_V2 = "notein-fountain-v2";
        public static final String INK_HIGHLIGHTER_BRUSH_FAMILY_ID_V1 = "notein-highlighter-v1";
        public static final String INK_PENCIL_BRUSH_FAMILY_ID_LEGACY = "pencil-unstable";
        public static final String INK_PENCIL_BRUSH_FAMILY_ID_V1 = "notein-pencil-v1";
        public static final String INK_PENCIL_BRUSH_FAMILY_ID_V2 = "notein-pencil-v2";
        public static final String INK_RAINBOW_BRUSH_FAMILY_ID_V1 = "notein-rainbow-v1";
        public static final String INK_RAINBOW_BRUSH_FAMILY_ID_V2 = "notein-rainbow-v2";
        public static final String LATEST_INK_BALLPOINT_BRUSH_FAMILY_ID = "notein-ballpoint-v1";
        public static final String LATEST_INK_FOUNTAIN_BRUSH_FAMILY_ID = "notein-fountain-v2";
        public static final String LATEST_INK_HIGHLIGHTER_BRUSH_FAMILY_ID = "notein-highlighter-v1";
        public static final String LATEST_INK_PENCIL_BRUSH_FAMILY_ID = "notein-pencil-v2";
        public static final String LATEST_INK_RAINBOW_BRUSH_FAMILY_ID = "notein-rainbow-v2";

        @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/ni_render_engine/impl/ink/BrushFamilyProvider$InkBrushFamilyId$Companion;", "", "<init>", "()V", "INK_PENCIL_BRUSH_FAMILY_ID_LEGACY", "", "INK_PENCIL_BRUSH_FAMILY_ID_V1", "INK_PENCIL_BRUSH_FAMILY_ID_V2", "LATEST_INK_PENCIL_BRUSH_FAMILY_ID", "INK_RAINBOW_BRUSH_FAMILY_ID_V1", "INK_RAINBOW_BRUSH_FAMILY_ID_V2", "LATEST_INK_RAINBOW_BRUSH_FAMILY_ID", "INK_FOUNTAIN_BRUSH_FAMILY_ID_V1", "INK_FOUNTAIN_BRUSH_FAMILY_ID_V2", "LATEST_INK_FOUNTAIN_BRUSH_FAMILY_ID", "INK_BALLPOINT_BRUSH_FAMILY_ID_V1", "LATEST_INK_BALLPOINT_BRUSH_FAMILY_ID", "INK_HIGHLIGHTER_BRUSH_FAMILY_ID_V1", "LATEST_INK_HIGHLIGHTER_BRUSH_FAMILY_ID", "isFountain", "", "clientBrushFamilyId", "isBallPoint", "ni-render-engine_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String INK_BALLPOINT_BRUSH_FAMILY_ID_V1 = "notein-ballpoint-v1";
            public static final String INK_FOUNTAIN_BRUSH_FAMILY_ID_V1 = "notein-fountain-v1";
            public static final String INK_FOUNTAIN_BRUSH_FAMILY_ID_V2 = "notein-fountain-v2";
            public static final String INK_HIGHLIGHTER_BRUSH_FAMILY_ID_V1 = "notein-highlighter-v1";
            public static final String INK_PENCIL_BRUSH_FAMILY_ID_LEGACY = "pencil-unstable";
            public static final String INK_PENCIL_BRUSH_FAMILY_ID_V1 = "notein-pencil-v1";
            public static final String INK_PENCIL_BRUSH_FAMILY_ID_V2 = "notein-pencil-v2";
            public static final String INK_RAINBOW_BRUSH_FAMILY_ID_V1 = "notein-rainbow-v1";
            public static final String INK_RAINBOW_BRUSH_FAMILY_ID_V2 = "notein-rainbow-v2";
            public static final String LATEST_INK_BALLPOINT_BRUSH_FAMILY_ID = "notein-ballpoint-v1";
            public static final String LATEST_INK_FOUNTAIN_BRUSH_FAMILY_ID = "notein-fountain-v2";
            public static final String LATEST_INK_HIGHLIGHTER_BRUSH_FAMILY_ID = "notein-highlighter-v1";
            public static final String LATEST_INK_PENCIL_BRUSH_FAMILY_ID = "notein-pencil-v2";
            public static final String LATEST_INK_RAINBOW_BRUSH_FAMILY_ID = "notein-rainbow-v2";

            private Companion() {
            }

            public final boolean isBallPoint(String clientBrushFamilyId) {
                OooOOO0.OooO0oO(clientBrushFamilyId, "clientBrushFamilyId");
                return clientBrushFamilyId.equals("notein-ballpoint-v1");
            }

            public final boolean isFountain(String clientBrushFamilyId) {
                OooOOO0.OooO0oO(clientBrushFamilyId, "clientBrushFamilyId");
                return clientBrushFamilyId.equals("notein-fountain-v1") || clientBrushFamilyId.equals("notein-fountain-v2");
            }
        }
    }

    private BrushFamilyProvider() {
    }

    private final void dumpBrushFamilyFile(C24457OooOOo brushFamily, String brushFamilyId) throws IOException {
        Context context = applicationContext;
        OooOOO0.OooO0Oo(context);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), C21111o0ooOoO.OooO0Oo(brushFamilyId == null ? brushFamily.OooO00o() : brushFamilyId, "_dump.brushfamily")));
        if (brushFamilyId != null) {
            try {
                brushFamily = new C24457OooOOo(brushFamily.f82669OooO0O0, C24457OooOOo.OooO0O0.f82676OooO0Oo, "", brushFamilyId);
            } finally {
            }
        }
        AndroidBrushFamilySerialization.encode(brushFamily, fileOutputStream, new com.aspose.slides.internal.p497xc.OooO00o());
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap dumpBrushFamilyFile$lambda$5$lambda$4(String clientTextureId) {
        OooOOO0.OooO0oO(clientTextureId, "clientTextureId");
        return INSTANCE.getCustomTexture(clientTextureId);
    }

    private final C24457OooOOo getCustomBrushFamily(final String brushFamilyId) {
        ConcurrentHashMap<String, C24457OooOOo> concurrentHashMap = BRUSH_FAMILY_CACHE;
        C24457OooOOo c24457OooOOo = concurrentHashMap.get(brushFamilyId);
        if (c24457OooOOo != null) {
            return c24457OooOOo;
        }
        synchronized (this) {
            C24457OooOOo c24457OooOOo2 = concurrentHashMap.get(brushFamilyId);
            if (c24457OooOOo2 != null) {
                return c24457OooOOo2;
            }
            Context context = applicationContext;
            if (context == null) {
                throw new IllegalStateException("BrushFamilyProvider not initialized");
            }
            final InputStream inputStreamOpen = context.getAssets().open("ink/" + brushFamilyId + ".noteinbrush");
            OooOOO0.OooO0o(inputStreamOpen, "open(...)");
            FilterInputStream filterInputStream = new FilterInputStream(inputStreamOpen) { // from class: com.orion.ni_render_engine.impl.ink.BrushFamilyProvider$getCustomBrushFamily$2$decryptedStream$1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read() throws IOException {
                    int i = super.read();
                    if (i == -1) {
                        return -1;
                    }
                    return (i ^ 93) & 255;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read(byte[] b, int off, int len) throws IOException {
                    OooOOO0.OooO0oO(b, "b");
                    int i = super.read(b, off, len);
                    if (i > 0) {
                        for (int i2 = 0; i2 < i; i2++) {
                            int i3 = off + i2;
                            b[i3] = (byte) (b[i3] ^ 93);
                        }
                    }
                    return i;
                }
            };
            try {
                C24457OooOOo c24457OooOOoDecode = AndroidBrushFamilySerialization.decode(filterInputStream, new BrushFamilyDecodeCallback() { // from class: com.orion.ni_render_engine.impl.ink.BrushFamilyProvider$getCustomBrushFamily$2$brushFamily$1$1
                    @Override // androidx.ink.storage.BrushFamilyDecodeCallback
                    public String onDecodeTexture(String clientTextureId, Bitmap bitmap) {
                        OooOOO0.OooO0oO(clientTextureId, "clientTextureId");
                        String strOooO0Oo = o0Oo0oo.OooO0Oo(brushFamilyId, C18115b5.CONNECTOR, clientTextureId);
                        if (bitmap != null) {
                            BrushFamilyProvider.TEXTURE_BITMAP_MAP.put(strOooO0Oo, bitmap);
                        }
                        return strOooO0Oo;
                    }
                });
                filterInputStream.close();
                concurrentHashMap.put(brushFamilyId, c24457OooOOoDecode);
                return c24457OooOOoDecode;
            } finally {
            }
        }
    }

    public final C24457OooOOo getBrushFamily(String clientBrushFamilyId) {
        OooOOO0.OooO0oO(clientBrushFamilyId, "clientBrushFamilyId");
        return clientBrushFamilyId.equals(C24485OoooO.OooO0O0().OooO00o()) ? C24485OoooO.OooO0O0() : clientBrushFamilyId.equals(C24485OoooO.OooO00o().OooO00o()) ? C24485OoooO.OooO00o() : clientBrushFamilyId.equals(C24485OoooO.OooO0OO().OooO00o()) ? C24485OoooO.OooO0OO() : getCustomBrushFamily(clientBrushFamilyId);
    }

    public final Bitmap getCustomTexture(String clientTextureId) {
        OooOOO0.OooO0oO(clientTextureId, "clientTextureId");
        return TEXTURE_BITMAP_MAP.get(clientTextureId);
    }

    public final void init(Context context) {
        OooOOO0.OooO0oO(context, "context");
        if (applicationContext == null) {
            applicationContext = context.getApplicationContext();
        }
    }
}
