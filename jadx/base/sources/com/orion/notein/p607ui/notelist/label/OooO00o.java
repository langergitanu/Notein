package com.orion.notein.p607ui.notelist.label;

import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelContainerFragment$whenFileBePassedToNotein$1", m80623f = "LabelContainerFragment.kt", m80624l = {201}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LabelContainerFragment f77819OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f77820OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f77821OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(LabelContainerFragment labelContainerFragment, Uri uri, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f77819OooOo = labelContainerFragment;
        this.f77821OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f77819OooOo, this.f77821OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f77820OooOo0o;
        LabelContainerFragment labelContainerFragment = this.f77819OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f77820OooOo0o = 1;
            obj = LabelContainerFragment.OooOoo0(labelContainerFragment, 37, this);
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
        int iCheckSelfPermission = ContextCompat.checkSelfPermission(labelContainerFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
        Uri uri = this.f77821OooOoO0;
        if (iCheckSelfPermission == 0) {
            labelContainerFragment.OooOoo().OooOOO(uri);
        } else {
            LabelContainerFragment.OooO00o oooO00o = labelContainerFragment.f77707Oooo;
            oooO00o.getClass();
            oooO00o.f77719OooO00o = uri;
            oooO00o.f77720OooO0O0.OooO00o("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
