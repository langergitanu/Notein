package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import android.graphics.RectF;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOO0OO.C27009OooO0oO;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.OooOOO;
import o0OOo0o.C27449o00O0OoO;
import o0oo000O.C31192OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$_navTnInfo$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {216}, m80625m = "invokeSuspend")
public final class C23555OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Page>, Boolean, Continuation<? super OooO0OO.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f76109OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f76110OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f76111OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f76112OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f76113OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23555OooO0Oo(OooO0OO oooO0OO, Continuation<? super C23555OooO0Oo> continuation) {
        super(3, continuation);
        this.f76113OooOoOO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Page> list, Boolean bool, Continuation<? super OooO0OO.OooO00o> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C23555OooO0Oo c23555OooO0Oo = new C23555OooO0Oo(this.f76113OooOoOO, continuation);
        c23555OooO0Oo.f76112OooOoO0 = list;
        c23555OooO0Oo.f76111OooOoO = zBooleanValue;
        return c23555OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Page page;
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f76109OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list = (List) this.f76112OooOoO0;
            if (this.f76111OooOoO && (page = (Page) OooOo.Oooo(list)) != null && page.getUnbounded()) {
                File file2 = new File(page.getTnPathForNavigator());
                if (file2.exists()) {
                    C27449o00O0OoO c27449o00O0OoO = this.f76113OooOoOO.f76066OooO0Oo;
                    String id = page.getId();
                    String noteId = page.getNoteId();
                    this.f76112OooOoO0 = page;
                    this.f76110OooOo0o = file2;
                    this.f76109OooOo = 1;
                    C27015OooOOoo c27015OooOOoo = c27449o00O0OoO.f96039OooO0o.f94064OooO00o;
                    c27015OooOOoo.getClass();
                    Object objOooO0oO = c27015OooOOoo.f94033OooO00o.OooO0oO(noteId, new OooOOO(new C27009OooO0oO(id, null), null));
                    if (objOooO0oO == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    file = file2;
                    obj = objOooO0oO;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        file = this.f76110OooOo0o;
        page = (Page) this.f76112OooOoO0;
        C32446OooOOOo.OooO0O0(obj);
        RectF rectFOooO00o = C31192OooOOOo.OooO00o((RectF) obj, null);
        String noteId2 = page.getNoteId();
        String id2 = page.getId();
        String absolutePath = file.getAbsolutePath();
        OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return new OooO0OO.OooO00o(noteId2, id2, absolutePath, file.lastModified(), rectFOooO00o);
    }
}
