package o0OOoo0O;

import android.net.Uri;
import com.orion.notein.domain.models.material.Sticker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27522o00o00oO;
import o0OOo0o.C27538o00o0o0O;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOoo0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.material.AddStickerToCollectionUseCase$execute$2", m80623f = "AddStickerToCollectionUseCase.kt", m80624l = {84}, m80625m = "invokeSuspend")
public final class C27838OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f98346OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f98347OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27836OooO0o f98348OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98349OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Sticker f98350OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27838OooO0oO(String str, C27836OooO0o c27836OooO0o, Sticker sticker, Continuation<? super C27838OooO0oO> continuation) {
        super(2, continuation);
        this.f98349OooOoO0 = str;
        this.f98348OooOoO = c27836OooO0o;
        this.f98350OooOoOO = sticker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27838OooO0oO(this.f98349OooOoO0, this.f98348OooOoO, this.f98350OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27838OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0108 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0016, B:30:0x0100, B:32:0x0108, B:35:0x0146, B:36:0x014d), top: B:44:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146 A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0016, B:30:0x0100, B:32:0x0108, B:35:0x0146, B:36:0x014d), top: B:44:0x0016 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98346OooOo;
        Sticker sticker = this.f98350OooOoOO;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f98347OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                if (((Boolean) objOooO0o).booleanValue()) {
                    throw new IllegalStateException("Failed to create sticker collection");
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AddStickerToCollectionUseCase");
                c20358OooO00o.OooO00o("Sticker collection created: " + sticker.getTitle() + " (id=" + sticker.getId() + ")", new Object[0]);
                C32501OooO0oO.OooO0Oo(file);
                c20358OooO00o.OooOOO0("AddStickerToCollectionUseCase");
                c20358OooO00o.OooO00o("Cleaned up temp directory", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                th = th;
                C32501OooO0oO.OooO0Oo(file);
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("AddStickerToCollectionUseCase");
                c20358OooO00o2.OooO00o("Cleaned up temp directory", new Object[0]);
                throw th;
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f98349OooOoO0;
        File file2 = new File(str);
        if (!file2.exists()) {
            throw new IllegalStateException("Sticker zip file not found at: ".concat(str));
        }
        C27836OooO0o c27836OooO0o = this.f98348OooOoO;
        File file3 = new File(c27836OooO0o.f98341OooO00o.getCacheDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("sticker_import_", sticker.getId()));
        if (file3.exists()) {
            C32501OooO0oO.OooO0Oo(file3);
        }
        file3.mkdirs();
        try {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("AddStickerToCollectionUseCase");
            c20358OooO00o3.OooO00o("Extracting sticker pack: " + file2.getAbsolutePath() + " -> " + file3.getAbsolutePath(), new Object[0]);
            C31193OooOOo.OooO0OO(file2, file3);
            List listOooO00o = C27836OooO0o.OooO00o(file3);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO00o, 10));
            Iterator it = listOooO00o.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.fromFile((File) it.next()));
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No sticker images found in zip file");
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("AddStickerToCollectionUseCase");
            c20358OooO00o4.OooO00o("Found " + arrayList.size() + " sticker images, creating collection", new Object[0]);
            C27538o00o0o0O c27538o00o0o0O = c27836OooO0o.f98342OooO0O0;
            String title = sticker.getTitle();
            String id = sticker.getId();
            this.f98347OooOo0o = file3;
            this.f98346OooOo = 1;
            c27538o00o0o0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27522o00o00oO(arrayList, id, false, c27538o00o0o0O, title, null), this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file = file3;
            if (((Boolean) objOooO0o).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
            file = file3;
            C32501OooO0oO.OooO0Oo(file);
            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o22.OooOOO0("AddStickerToCollectionUseCase");
            c20358OooO00o22.OooO00o("Cleaned up temp directory", new Object[0]);
            throw th;
        }
    }
}
