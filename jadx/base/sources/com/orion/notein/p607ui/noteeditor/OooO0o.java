package com.orion.notein.p607ui.noteeditor;

import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.penkit.models.ImageInfo;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$dropData$2", m80623f = "NoteEditorFragment.kt", m80624l = {2837}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f73491OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageInfo f73492OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73493OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo.OooO0OO f73494OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f73495OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(C23344OooOOo.OooO0OO oooO0OO, NoteEditorFragment noteEditorFragment, boolean z, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f73494OooOoO0 = oooO0OO;
        this.f73493OooOoO = noteEditorFragment;
        this.f73495OooOoOO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f73494OooOoO0, this.f73493OooOoO, this.f73495OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooOO0O;
        ImageInfo imageInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73491OooOo;
        NoteEditorFragment noteEditorFragment = this.f73493OooOoO;
        C23344OooOOo.OooO0OO oooO0OO = this.f73494OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Object obj2 = oooO0OO.f73626OooO0OO;
            ImageInfo imageInfo2 = obj2 instanceof ImageInfo ? (ImageInfo) obj2 : null;
            if (imageInfo2 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            String str = (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue();
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            File file = new File(imageInfo2.getUri());
            String id = imageInfo2.getId();
            this.f73492OooOo0o = imageInfo2;
            this.f73491OooOo = 1;
            objOooOO0O = c23344OooOOoOoooOO0.OooOO0O(file, str, id, this);
            if (objOooOO0O == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            imageInfo = imageInfo2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ImageInfo imageInfo3 = this.f73492OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0O = obj;
            imageInfo = imageInfo3;
        }
        ImageInfo imageInfoCopy$default = ImageInfo.copy$default(imageInfo, null, (String) objOooOO0O, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView != null) {
            pDFView.Oooo00o(oooO0OO.f73624OooO00o, OooOo.OooO0oO(imageInfoCopy$default), Boolean.valueOf(this.f73495OooOoOO));
            return C32460OooOooO.f116667OooO00o;
        }
        OooOOO0.OooOOOO("editor");
        throw null;
    }
}
