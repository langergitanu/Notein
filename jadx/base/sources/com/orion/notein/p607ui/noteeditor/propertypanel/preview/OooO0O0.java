package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.label.ItemData;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$7$onLabelButtonClicked$1", m80623f = "EditorPreviewFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_3}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EditorPreviewFragment f76062OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f76063OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PagePreviewVO f76064OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(EditorPreviewFragment editorPreviewFragment, PagePreviewVO pagePreviewVO, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f76062OooOo = editorPreviewFragment;
        this.f76064OooOoO0 = pagePreviewVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f76062OooOo, this.f76064OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f76063OooOo0o;
        EditorPreviewFragment editorPreviewFragment = this.f76062OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            editorPreviewFragment.OooOoo0().Oooo0o(1);
            this.f76063OooOo0o = 1;
            obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 30, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        PagePreviewVO pagePreviewVO = this.f76064OooOoO0;
        ItemData itemData = new ItemData(null, pagePreviewVO.getNoteId(), pagePreviewVO.getId(), 2, 1);
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = editorPreviewFragment.requireActivity();
        OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{itemData});
        return C32460OooOooO.f116667OooO00o;
    }
}
