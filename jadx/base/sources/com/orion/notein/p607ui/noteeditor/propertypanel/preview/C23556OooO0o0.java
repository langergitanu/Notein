package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import android.graphics.RectF;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$tnNavigatorInfo$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23556OooO0o0 extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends PagePreviewVO>, OooO0OO.OooO00o, C32443OooOOO<? extends String, ? extends RectF>, Continuation<? super OooO0OO.OooO0O0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ OooO0OO.OooO00o f76119OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f76120OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f76121OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends PagePreviewVO> list, OooO0OO.OooO00o oooO00o, C32443OooOOO<? extends String, ? extends RectF> c32443OooOOO, Continuation<? super OooO0OO.OooO0O0> continuation) {
        C23556OooO0o0 c23556OooO0o0 = new C23556OooO0o0(4, continuation);
        c23556OooO0o0.f76120OooOo0o = list;
        c23556OooO0o0.f76119OooOo = oooO00o;
        c23556OooO0o0.f76121OooOoO0 = c32443OooOOO;
        return c23556OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f76120OooOo0o;
        OooO0OO.OooO00o oooO00o = this.f76119OooOo;
        C32443OooOOO c32443OooOOO = this.f76121OooOoO0;
        String str = (String) c32443OooOOO.f116638OooOo0o;
        RectF rectF = (RectF) c32443OooOOO.f116637OooOo;
        if (OooOOO0.OooO0O0(oooO00o != null ? oooO00o.f76093OooO00o : null, str)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                PagePreviewVO pagePreviewVO = (PagePreviewVO) next;
                if (OooOOO0.OooO0O0(pagePreviewVO.getId(), oooO00o.f76094OooO0O0) && OooOOO0.OooO0O0(pagePreviewVO.getNoteId(), oooO00o.f76093OooO00o)) {
                    break;
                }
            }
            PagePreviewVO pagePreviewVO2 = (PagePreviewVO) next;
            if (pagePreviewVO2 != null) {
                return new OooO0OO.OooO0O0(pagePreviewVO2, oooO00o.f76095OooO0OO, oooO00o.f76096OooO0Oo, oooO00o.f76097OooO0o0, rectF);
            }
        }
        return null;
    }
}
