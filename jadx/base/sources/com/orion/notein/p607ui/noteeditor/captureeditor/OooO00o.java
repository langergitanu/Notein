package com.orion.notein.p607ui.noteeditor.captureeditor;

import Oooo0oO.C21111o0ooOoO;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.core.os.PersistableBundleKt;
import com.google.gson.Gson;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureEditorPanel;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28036OooO0O0;
import o0OoOoO0.C29212OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.captureeditor.CaptureEditorPanel$dragStart$1", m80623f = "CaptureEditorPanel.kt", m80624l = {73, 80}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f74460OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Bitmap f74461OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ CaptureEditorPanel f74462OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(CaptureEditorPanel captureEditorPanel, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f74462OooOoO0 = captureEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f74462OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO00o;
        Object objOooO0o;
        Bitmap bitmap;
        String str;
        Uri uriForFile;
        RectF rectF;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74460OooOo;
        CaptureEditorPanel captureEditorPanel = this.f74462OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CaptureEditorPanel.OooO0O0 oooO0O0 = captureEditorPanel.f74449OooOoo;
            if (oooO0O0 == null) {
                OooOOO0.OooOOOO("imageProvider");
                throw null;
            }
            RectF rectF2 = captureEditorPanel.f74444OooOo;
            if (rectF2 == null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            this.f74460OooOo = 1;
            objOooO00o = oooO0O0.OooO00o(rectF2, this);
            if (objOooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = this.f74461OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            str = (String) objOooO0o;
            if (str == null) {
                uriForFile = FileProvider.getUriForFile(captureEditorPanel.getContext(), C21111o0ooOoO.OooO0Oo(captureEditorPanel.getContext().getApplicationContext().getPackageName(), ".fileProvider"), new File(str));
            } else {
                uriForFile = null;
            }
            ClipData clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"image/*"}, new ClipData.Item(uriForFile));
            Gson gson = new Gson();
            rectF = captureEditorPanel.f74444OooOo;
            if (rectF != null) {
                OooOOO0.OooOOOO("editorBounds");
                throw null;
            }
            String json = gson.toJson(rectF);
            Gson gson2 = new Gson();
            RectF rectF3 = captureEditorPanel.f74447OooOoO0;
            if (rectF3 == null) {
                OooOOO0.OooOOOO("boundsOfPageCoordinate");
                throw null;
            }
            String json2 = gson2.toJson(rectF3);
            ClipDescription description = clipData.getDescription();
            C32443OooOOO c32443OooOOO = new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, new Integer(5));
            Context context = captureEditorPanel.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            Activity activityOooO00o = C28036OooO0O0.OooO00o(context);
            C32443OooOOO c32443OooOOO2 = new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_ACTIVITY_HASH, String.valueOf(activityOooO00o != null ? activityOooO00o.hashCode() : 0));
            String str2 = captureEditorPanel.f74451OooOooO;
            if (str2 == null) {
                OooOOO0.OooOOOO("sourceNoteId");
                throw null;
            }
            C32443OooOOO c32443OooOOO3 = new C32443OooOOO("source_note_id", str2);
            String str3 = captureEditorPanel.f74452OooOooo;
            if (str3 == null) {
                OooOOO0.OooOOOO("sourcePageId");
                throw null;
            }
            C32443OooOOO c32443OooOOO4 = new C32443OooOOO("source_page_id", str3);
            float f = CaptureEditorPanel.f74443Oooo000;
            description.setExtras(PersistableBundleKt.persistableBundleOf(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, c32443OooOOO4, new C32443OooOOO("source_type", new Integer(0)), new C32443OooOOO("image_path", str), new C32443OooOOO("source_bounds", json), new C32443OooOOO("source_bounds_of_page", json2)));
            CaptureResizeEditor captureResizeEditor = captureEditorPanel.f74445OooOo0o;
            if (captureResizeEditor == null) {
                OooOOO0.OooOOOO("captureContent");
                throw null;
            }
            CaptureEditorPanel.OooO00o oooO00o = new CaptureEditorPanel.OooO00o(bitmap, captureResizeEditor);
            CaptureResizeEditor captureResizeEditor2 = captureEditorPanel.f74445OooOo0o;
            if (captureResizeEditor2 != null) {
                captureResizeEditor2.startDragAndDrop(clipData, oooO00o, null, 257);
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("captureContent");
            throw null;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooO00o = obj;
        Bitmap bitmap2 = (Bitmap) objOooO00o;
        float f2 = CaptureEditorPanel.f74443Oooo000;
        if (bitmap2.getWidth() == 0 || bitmap2.getHeight() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CaptureEditorPanel");
            c20358OooO00o.OooOO0O("dragStart: bitmap width or height is 0, return", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        this.f74461OooOo0o = bitmap2;
        this.f74460OooOo = 2;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29212OooO00o(captureEditorPanel, bitmap2, null), this);
        if (objOooO0o != enumC32485OooO00o) {
            bitmap = bitmap2;
            str = (String) objOooO0o;
            if (str == null) {
            }
            ClipData clipData2 = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"image/*"}, new ClipData.Item(uriForFile));
            Gson gson3 = new Gson();
            rectF = captureEditorPanel.f74444OooOo;
            if (rectF != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
