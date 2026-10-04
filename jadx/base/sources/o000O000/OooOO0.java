package o000O000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji2.text.C21868OooO0o0;
import androidx.emoji2.text.OooO0OO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.label.LabelManagementBottomSheet;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82274OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82275OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f82275OooOo0o = i;
        this.f82274OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f82275OooOo0o) {
            case 0:
                C21868OooO0o0.OooO0O0 oooO0O0 = (C21868OooO0o0.OooO0O0) this.f82274OooOo;
                synchronized (oooO0O0.f64730OooO0Oo) {
                    try {
                        if (oooO0O0.f64734OooO0oo == null) {
                            return;
                        }
                        try {
                            FontsContractCompat.FontInfo fontInfoOooO0OO = oooO0O0.OooO0OO();
                            int resultCode = fontInfoOooO0OO.getResultCode();
                            if (resultCode == 2) {
                                synchronized (oooO0O0.f64730OooO0Oo) {
                                }
                            }
                            if (resultCode != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");
                            }
                            try {
                                TraceCompat.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C21868OooO0o0.OooO00o oooO00o = oooO0O0.f64729OooO0OO;
                                Context context = oooO0O0.f64727OooO00o;
                                oooO00o.getClass();
                                Typeface typefaceBuildTypeface = FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfoOooO0OO});
                                ByteBuffer byteBufferMmap = TypefaceCompatUtil.mmap(oooO0O0.f64727OooO00o, null, fontInfoOooO0OO.getUri());
                                if (byteBufferMmap == null || typefaceBuildTypeface == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
                                    C24385OooOO0o c24385OooOO0o = new C24385OooOO0o(typefaceBuildTypeface, OooOO0O.OooO00o(byteBufferMmap));
                                    TraceCompat.endSection();
                                    synchronized (oooO0O0.f64730OooO0Oo) {
                                        try {
                                            OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo = oooO0O0.f64734OooO0oo;
                                            if (abstractC21866OooO0oo != null) {
                                                abstractC21866OooO0oo.OooO0O0(c24385OooOO0o);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    oooO0O0.OooO0O0();
                                    return;
                                } finally {
                                    TraceCompat.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (oooO0O0.f64730OooO0Oo) {
                                try {
                                    OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo2 = oooO0O0.f64734OooO0oo;
                                    if (abstractC21866OooO0oo2 != null) {
                                        abstractC21866OooO0oo2.OooO00o(th2);
                                    }
                                    oooO0O0.OooO0O0();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 1:
                RecyclerView recyclerView = ((LabelManagementBottomSheet) this.f82274OooOo).f71894Oooo00O;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(0);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                    throw null;
                }
            default:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) this.f82274OooOo).Oooo0oO();
                return;
        }
    }
}
