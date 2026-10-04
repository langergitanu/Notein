package com.orion.notein.p607ui.creative_library;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.OooO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.creative_library.C23047OooOoOO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOoo0O.C27831OooO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreatorProfileViewModel$applyMaterial$1", m80623f = "CreatorProfileViewModel.kt", m80624l = {StyleIdentifier.TABLE_GRID_LIGHT}, m80625m = "invokeSuspend")
public final class C23050OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23047OooOoOO f71233OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71234OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71235OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23050OooOoo0(C23047OooOoOO c23047OooOoOO, String str, Continuation<? super C23050OooOoo0> continuation) {
        super(2, continuation);
        this.f71233OooOo = c23047OooOoOO;
        this.f71235OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23050OooOoo0(this.f71233OooOo, this.f71235OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23050OooOoo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71234OooOo0o;
        C23047OooOoOO c23047OooOoOO = this.f71233OooOo;
        String str = this.f71235OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f71234OooOo0o = 1;
            obj = c23047OooOoOO.f71196OooO0oo.OooO00o(str, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27831OooO.OooO00o oooO00o = (C27831OooO.OooO00o) obj;
        if (oooO00o instanceof C27831OooO.OooO00o.OooO0O0) {
            do {
                c33781o00o0O = c23047OooOoOO.f71198OooOO0O;
                value = c33781o00o0O.getValue();
                List<C23047OooOoOO.OooO00o> list = (List) value;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C23047OooOoOO.OooO00o OooO00o2 : list) {
                    if (OooOOO0.OooO0O0(OooO00o2.f71204OooO00o, str)) {
                        OooO00o2 = C23047OooOoOO.OooO00o.OooO00o(OooO00o2, null, null, FrameMetricsAggregator.EVERY_DURATION);
                    }
                    arrayList.add(OooO00o2);
                }
            } while (!c33781o00o0O.OooO(value, arrayList));
        } else {
            if (!(oooO00o instanceof C27831OooO.OooO00o.C19873OooO00o)) {
                throw new C32442OooOO0o();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(OooO.OooO0O0(c20358OooO00o, "CreatorProfileVM", "Failed to apply material: ", str), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
