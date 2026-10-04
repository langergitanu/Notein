package o0o00o;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import o0O0oooO.C26320o0000OoO;
import o0OoO0.C28513OooO0oO;
import o0Ooo0oo.C29506o00000O0;
import o0Ooo0oo.C29559o00ooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements PenBox.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106254OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26320o0000OoO f106255OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f106256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24019OooOO0o f106257OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ActivityC21897OooOo0 f106258OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24019OooOO0o f106259OooO0oO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.PenSettingsFavoriteListener$onAddCurrentPenIntoFavorites$1", m80623f = "PenSettingsFavoriteListener.kt", m80624l = {42, 51}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106261OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f106262OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106262OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooOOO0.this.new OooO00o(this.f106262OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            if (r8 == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Type inference failed for: r8v15, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooO00o] */
        /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106261OooOo0o;
            OooOOO0 oooOOO0 = OooOOO0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = oooOOO0.f106255OooO0OO;
                this.f106261OooOo0o = 1;
                obj = c26320o0000OoO.OooOOO0(10, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = oooOOO0.f106253OooO00o;
                    oooO0O0.getClass();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0), oooO0O0.f75201o00Ooo, null, new C29559o00ooo(oooO0O0, this.f106262OooOoO0, null), 2);
                } else {
                    oooOOO0.f106259OooO0oO.invoke();
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = false;
            boolean z = ((Number) obj).intValue() == 0;
            oooOOO0.f106253OooO00o.OooOO0o(true);
            int size = ((List) oooOOO0.f106253OooO00o.f75205ooOO.f121747OooOo0o.getValue()).size();
            if (size >= 20) {
                Context context = oooOOO0.f106256OooO0Oo;
                C28513OooO0oO.OooO00o(context, R.string.favorite_pen_size_limit, "getString(...)", context);
                return C32460OooOooO.f116667OooO00o;
            }
            if (size >= 3 && !z) {
                ?? r8 = oooOOO0.f106257OooO0o;
                Integer num = new Integer(10);
                this.f106261OooOo0o = 2;
                obj = r8.invoke(num, this);
            }
            if (zBooleanValue) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC21987OooOoo lifecycleOwner, C26320o0000OoO userViewModel, Context context, ActivityC21897OooOo0 activityC21897OooOo0, InterfaceC32508OooOOOo interfaceC32508OooOOOo, oO0O000o.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(userViewModel, "userViewModel");
        this.f106253OooO00o = viewModel;
        this.f106254OooO0O0 = lifecycleOwner;
        this.f106255OooO0OO = userViewModel;
        this.f106256OooO0Oo = context;
        this.f106258OooO0o0 = activityC21897OooOo0;
        this.f106257OooO0o = (C24019OooOO0o) interfaceC32508OooOOOo;
        this.f106259OooO0oO = (C24019OooOO0o) oooO00o;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO
    public final void OooO00o(int i) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106253OooO00o;
        oooO0O0.getClass();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0), oooO0O0.f75201o00Ooo, null, new C29506o00000O0(oooO0O0, i, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO
    public final void OooO0O0(int i) {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this.f106254OooO0O0), null, null, new OooO00o(i, null), 3);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO
    public final boolean OooO0OO() {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106253OooO00o;
        if (!((Collection) oooO0O0.f75205ooOO.f121747OooOo0o.getValue()).isEmpty()) {
            oooO0O0.OooOO0o(true);
            return true;
        }
        ActivityC21897OooOo0 activityC21897OooOo0 = this.f106258OooO0o0;
        MainActivity mainActivity = activityC21897OooOo0 instanceof MainActivity ? (MainActivity) activityC21897OooOo0 : null;
        if (mainActivity == null) {
            return false;
        }
        mainActivity.showGuideVideo(15);
        return false;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO
    public final boolean OooO0Oo(int i, Bundle bundle) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106253OooO00o;
        List list = (List) oooO0O0.f75161OooOoO.f121747OooOo0o.getValue();
        PenInfo penInfo = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        switch (i) {
            case 0:
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((PenInfo) next).getType() == i) {
                            obj11 = next;
                        }
                    }
                }
                penInfo = (PenInfo) obj11;
                break;
            case 1:
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((PenInfo) next2).getType() == i) {
                            obj10 = next2;
                        }
                    }
                }
                penInfo = (PenInfo) obj10;
                break;
            case 2:
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (((PenInfo) next3).getType() == i) {
                            obj9 = next3;
                        }
                    }
                }
                penInfo = (PenInfo) obj9;
                break;
            case 3:
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        PenInfo penInfo2 = (PenInfo) next4;
                        if (penInfo2.getType() == i) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo2.getExtra().getString(C18437z2.f56754h), bundle != null ? bundle.getString(C18437z2.f56754h) : null)) {
                                obj8 = next4;
                            }
                        }
                    }
                }
                penInfo = (PenInfo) obj8;
                break;
            case 4:
                Iterator it5 = list.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        PenInfo penInfo3 = (PenInfo) next5;
                        if (penInfo3.getType() == i) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo3.getExtra().getString(C18437z2.f56754h), bundle != null ? bundle.getString(C18437z2.f56754h) : null)) {
                                obj7 = next5;
                            }
                        }
                    }
                }
                penInfo = (PenInfo) obj7;
                break;
            case 7:
                Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        PenInfo penInfo4 = (PenInfo) next6;
                        if (penInfo4.getType() == i) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo4.getExtra().getString(C18437z2.f56754h), bundle != null ? bundle.getString(C18437z2.f56754h) : null)) {
                                obj6 = next6;
                            }
                        }
                    }
                }
                penInfo = (PenInfo) obj6;
                break;
            case 8:
                Iterator it7 = list.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        PenInfo penInfo5 = (PenInfo) next7;
                        if (penInfo5.getType() == i) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(penInfo5.getExtra().getString(C18437z2.f56754h), bundle != null ? bundle.getString(C18437z2.f56754h) : null)) {
                                obj5 = next7;
                            }
                        }
                    }
                }
                penInfo = (PenInfo) obj5;
                break;
            case 9:
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        if (((PenInfo) next8).getType() == i) {
                            obj4 = next8;
                        }
                    }
                }
                penInfo = (PenInfo) obj4;
                break;
            case 10:
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        if (((PenInfo) next9).getType() == i) {
                            obj3 = next9;
                        }
                    }
                }
                penInfo = (PenInfo) obj3;
                break;
            case 11:
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        if (((PenInfo) next10).getType() == i) {
                            obj2 = next10;
                        }
                    }
                }
                penInfo = (PenInfo) obj2;
                break;
            case 12:
                Iterator it11 = list.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        if (((PenInfo) next11).getType() == i) {
                            obj = next11;
                        }
                    }
                }
                penInfo = (PenInfo) obj;
                break;
        }
        if (penInfo == null) {
            return false;
        }
        List list2 = (List) oooO0O0.f75198o000oOoO.f121747OooOo0o.getValue();
        Iterable iterable = (Iterable) oooO0O0.f75205ooOO.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it12 = iterable.iterator();
        while (it12.hasNext()) {
            arrayList.add(((FavoritePenVO) it12.next()).getId());
        }
        Set setO0OO00O = OooOo.o0OO00O(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj12 : list2) {
            if (setO0OO00O.contains(((PenInfo) obj12).getId())) {
                arrayList2.add(obj12);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it13 = arrayList2.iterator();
        while (it13.hasNext()) {
            if (((PenInfo) it13.next()).hasSamePenSettings(penInfo)) {
                return true;
            }
        }
        return false;
    }
}
