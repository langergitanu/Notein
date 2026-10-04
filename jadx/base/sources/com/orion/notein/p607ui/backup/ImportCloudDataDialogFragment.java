package com.orion.notein.p607ui.backup;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.OooOOOO;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.backup.OooO00o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0OOo.C28082OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoOO00.ViewOnClickListenerC28989OooO00o;
import o0oOoOo.C31055OooOoOO;
import o0oOoo00.C31134OooOo;
import o0oOoo00.C31140OooOoO0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/backup/ImportCloudDataDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImportCloudDataDialogFragment extends Hilt_ImportCloudDataDialogFragment {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C28082OooO00o f70631OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f70632Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ViewGroup f70633Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f70634Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f70635Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f70636Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f70637Oooo0OO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f70630OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(com.orion.notein.p607ui.backup.OooO00o.class), new C22999OooO0o0(), new C23000OooO0oO(), new OooO0o());

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final CloudBackupResultDialogFragment f70638Oooo0o0 = new CloudBackupResultDialogFragment();

    public final class OooO00o extends ClickableSpan {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Context f70639OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f70640OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ImportCloudDataDialogFragment f70641OooOoO0;

        public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment, String folderPath, Context context) {
            OooOOO0.OooO0oO(folderPath, "folderPath");
            this.f70641OooOoO0 = importCloudDataDialogFragment;
            this.f70640OooOo0o = folderPath;
            this.f70639OooOo = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            OooOOO0.OooO0oO(widget, "widget");
            this.f70641OooOoO0.OooOoo0().OooOOO0(this.f70640OooOo0o);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            OooOOO0.OooO0oO(ds, "ds");
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
            ds.setColor(ContextCompat.getColor(this.f70639OooOo, R.color.item_text_name_color));
        }
    }

    public static final class OooO0O0 implements SearchView.OooOOO0 {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = ImportCloudDataDialogFragment.this.OooOoo0();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = oooO00oOooOoo0.f70711OooOooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = oooO00oOooOoo0.f70709OooOoo;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$3$1", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {98}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70644OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ImportCloudDataDialogFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOooO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70644OooOo0o;
            ImportCloudDataDialogFragment importCloudDataDialogFragment = ImportCloudDataDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                this.f70644OooOo0o = 1;
                objOooO = oooO00oOooOoo0.OooO(this);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO = obj;
            }
            int iIntValue = ((Number) objOooO).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        if (importCloudDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                            ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                            ViewOnClickListenerC28408OooO0O0 viewOnClickListenerC28408OooO0O0 = new ViewOnClickListenerC28408OooO0O0(importCloudDataDialogFragment, 8);
                            String string = importCloudDataDialogFragment.getString(R.string.upgrade_now);
                            OooOOO0.OooO0o(string, "getString(...)");
                            int i2 = importCloudDataDialogFragment.OooOoo0().f70689OooO0oO.f96920OooO0Oo.f95374OooO00o.OooO0OO(true).f88053OooO00o - 1;
                            int i3 = i2 >= 1 ? i2 : 1;
                            String string2 = importCloudDataDialogFragment.getString(R.string.title_upgrade_to_vip_create_note);
                            OooOOO0.OooO0o(string2, "getString(...)");
                            String string3 = importCloudDataDialogFragment.getString(R.string.content_upgrade_to_vip_create_note, Integer.valueOf(i3));
                            OooOOO0.OooO0o(string3, "getString(...)");
                            new TipsDialogFragment(string2, string3, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28408OooO0O0, null, string, 0, null, 384).show(importCloudDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (iIntValue == 9) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo02 = importCloudDataDialogFragment.OooOoo0();
                    Map map = (Map) oooO00oOooOoo02.f70710OooOoo0.getValue();
                    if (map != null) {
                        Float fValueOf = Float.valueOf(0.0f);
                        C33781o00o0O c33781o00o0O = oooO00oOooOoo02.f70697OooOOOo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, fValueOf);
                        oooO00oOooOoo02.f70693OooOO0o.setValue(null);
                        ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(map.values());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : arrayListOooOo00) {
                            if (((Set) oooO00oOooOoo02.f70709OooOoo.getValue()).contains(((BackupFile) obj2).getId())) {
                                arrayList.add(obj2);
                            }
                        }
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C31134OooOo(arrayList, oooO00oOooOoo02, null), 3);
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C31140OooOoO0(arrayList, oooO00oOooOoo02, null), 3);
                    }
                    C21030OooOO0o.OooO0OO(importCloudDataDialogFragment).OooOOo(R.id.noteListContainerFragment, false);
                } else if (importCloudDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    String string4 = importCloudDataDialogFragment.getString(R.string.tips);
                    OooOOO0.OooO0o(string4, "getString(...)");
                    String string5 = importCloudDataDialogFragment.getString(R.string.hit_my_templates_vip_limit);
                    OooOOO0.OooO0o(string5, "getString(...)");
                    new TipsDialogFragment(string4, string5, null, null).show(importCloudDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
                }
            } else if (importCloudDataDialogFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                String string6 = importCloudDataDialogFragment.getString(R.string.tips);
                OooOOO0.OooO0o(string6, "getString(...)");
                String string7 = importCloudDataDialogFragment.getString(R.string.hit_max_num_of_my_templates);
                OooOOO0.OooO0o(string7, "getString(...)");
                new TipsDialogFragment(string6, string7, null, null).show(importCloudDataDialogFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C22997OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70646OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$1", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {153}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportCloudDataDialogFragment f70647OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70648OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19153OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportCloudDataDialogFragment f70649OooOo0o;

                public C19153OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment) {
                    this.f70649OooOo0o = importCloudDataDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    boolean z = false;
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70649OooOo0o;
                    if (list == null) {
                        ImageView imageView = importCloudDataDialogFragment.f70636Oooo0O0;
                        if (imageView == null) {
                            OooOOO0.OooOOOO("emptyView");
                            throw null;
                        }
                        imageView.setVisibility(8);
                        View view = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view.setVisibility(0);
                        View view2 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view2.getContext(), R.anim.rotate_loop);
                        OooOOO0.OooO0o(animationLoadAnimation, "loadAnimation(...)");
                        View view3 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view3 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view3.startAnimation(animationLoadAnimation);
                    } else if (list.isEmpty()) {
                        View view4 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view4 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view4.setVisibility(8);
                        View view5 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view5 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view5.clearAnimation();
                        ImageView imageView2 = importCloudDataDialogFragment.f70636Oooo0O0;
                        if (imageView2 == null) {
                            OooOOO0.OooOOOO("emptyView");
                            throw null;
                        }
                        imageView2.setVisibility(0);
                    } else {
                        View view6 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view6 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view6.setVisibility(8);
                        View view7 = importCloudDataDialogFragment.f70637Oooo0OO;
                        if (view7 == null) {
                            OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view7.clearAnimation();
                        ImageView imageView3 = importCloudDataDialogFragment.f70636Oooo0O0;
                        if (imageView3 == null) {
                            OooOOO0.OooOOOO("emptyView");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                    }
                    if (list == null) {
                        list = C34434OooOoO.f123453OooOo0o;
                    }
                    List<T> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((C31055OooOoOO) it.next()).f110872OooO0o) {
                                z = true;
                                break;
                            }
                        }
                    }
                    TextView textView = importCloudDataDialogFragment.f70632Oooo0;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    C28082OooO00o c28082OooO00o = importCloudDataDialogFragment.f70631OooOooo;
                    if (c28082OooO00o != null) {
                        c28082OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("noteinAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f70647OooOo = importCloudDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f70647OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70648OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70647OooOo;
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                    C19153OooO00o c19153OooO00o = new C19153OooO00o(importCloudDataDialogFragment);
                    this.f70648OooOo0o = 1;
                    if (oooO00oOooOoo0.f70712OooOooo.f121747OooOo0o.collect(c19153OooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$2", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {176}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportCloudDataDialogFragment f70650OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70651OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportCloudDataDialogFragment f70652OooOo0o;

                public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment) {
                    this.f70652OooOo0o = importCloudDataDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) obj;
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70652OooOo0o;
                    if (oooO0O0.f70727OooO00o.length() == 0) {
                        ViewGroup viewGroup = importCloudDataDialogFragment.f70633Oooo000;
                        if (viewGroup == null) {
                            OooOOO0.OooOOOO("layoutBreadCrumbs");
                            throw null;
                        }
                        viewGroup.setVisibility(8);
                    } else {
                        List<OooO00o.OooO0O0.C19159OooO00o> list = oooO0O0.f70728OooO0O0;
                        if (!list.isEmpty()) {
                            ViewGroup viewGroup2 = importCloudDataDialogFragment.f70633Oooo000;
                            if (viewGroup2 == null) {
                                OooOOO0.OooOOOO("layoutBreadCrumbs");
                                throw null;
                            }
                            int i = 0;
                            viewGroup2.setVisibility(0);
                            ArrayList arrayList = new ArrayList();
                            String str = "";
                            int i2 = 0;
                            for (T t : list) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    C34429OooOOo0.OooOOo();
                                    throw null;
                                }
                                OooO00o.OooO0O0.C19159OooO00o c19159OooO00o = (OooO00o.OooO0O0.C19159OooO00o) t;
                                if (i2 > 0) {
                                    str = ((Object) str) + " > ";
                                }
                                arrayList.add(new C32443OooOOO(Integer.valueOf(str.length()), Integer.valueOf(c19159OooO00o.f70730OooO0O0.length() + str.length())));
                                str = ((Object) str) + c19159OooO00o.f70730OooO0O0;
                                i2 = i3;
                            }
                            SpannableString spannableString = new SpannableString(str);
                            for (Object obj2 : arrayList) {
                                int i4 = i + 1;
                                if (i < 0) {
                                    C34429OooOOo0.OooOOo();
                                    throw null;
                                }
                                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj2;
                                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                                int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                                String str2 = list.get(i).f70729OooO00o;
                                TextView textView = importCloudDataDialogFragment.f70634Oooo00O;
                                if (textView == null) {
                                    OooOOO0.OooOOOO("txtBreadCrumbs");
                                    throw null;
                                }
                                Context context = textView.getContext();
                                OooOOO0.OooO0o(context, "getContext(...)");
                                spannableString.setSpan(new OooO00o(importCloudDataDialogFragment, str2, context), iIntValue, iIntValue2, 33);
                                i = i4;
                            }
                            TextView textView2 = importCloudDataDialogFragment.f70634Oooo00O;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("txtBreadCrumbs");
                                throw null;
                            }
                            textView2.setText(spannableString);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f70650OooOo = importCloudDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f70650OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70651OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70650OooOo;
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(importCloudDataDialogFragment);
                this.f70651OooOo0o = 1;
                oooO00oOooOoo0.f70708OooOoOO.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$3", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {177}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportCloudDataDialogFragment f70653OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70654OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportCloudDataDialogFragment f70655OooOo0o;

                public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment) {
                    this.f70655OooOo0o = importCloudDataDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70655OooOo0o;
                    if (importCloudDataDialogFragment.getContext() != null) {
                        if (iIntValue == 0) {
                            TextView textView = importCloudDataDialogFragment.f70635Oooo00o;
                            if (textView == null) {
                                OooOOO0.OooOOOO("btnComposite");
                                throw null;
                            }
                            textView.setText(importCloudDataDialogFragment.getString(R.string.cancel));
                        } else if (iIntValue == 1) {
                            TextView textView2 = importCloudDataDialogFragment.f70635Oooo00o;
                            if (textView2 == null) {
                                OooOOO0.OooOOOO("btnComposite");
                                throw null;
                            }
                            textView2.setText(importCloudDataDialogFragment.getString(R.string.select_all));
                        } else if (iIntValue == 2) {
                            TextView textView3 = importCloudDataDialogFragment.f70635Oooo00o;
                            if (textView3 == null) {
                                OooOOO0.OooOOOO("btnComposite");
                                throw null;
                            }
                            textView3.setText(importCloudDataDialogFragment.getString(R.string.unselect_all));
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f70653OooOo = importCloudDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f70653OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70654OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70653OooOo;
                    com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(importCloudDataDialogFragment);
                    this.f70654OooOo0o = 1;
                    if (oooO00oOooOoo0.f70715Oooo00O.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                throw new C32438OooO0oO();
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0Oo, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$4", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {178}, m80625m = "invokeSuspend")
        public static final class C19154OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportCloudDataDialogFragment f70656OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70657OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportCloudDataDialogFragment f70658OooOo0o;

                public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment) {
                    this.f70658OooOo0o = importCloudDataDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    TextView textView = this.f70658OooOo0o.f70632Oooo0;
                    if (textView != null) {
                        textView.setEnabled(!zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnConfirm");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19154OooO0Oo(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super C19154OooO0Oo> continuation) {
                super(2, continuation);
                this.f70656OooOo = importCloudDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19154OooO0Oo(this.f70656OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19154OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70657OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70656OooOo;
                com.orion.notein.p607ui.backup.OooO00o oooO00oOooOoo0 = importCloudDataDialogFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(importCloudDataDialogFragment);
                this.f70657OooOo0o = 1;
                oooO00oOooOoo0.f70716Oooo00o.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$5", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {181}, m80625m = "invokeSuspend")
        public static final class C22998OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImportCloudDataDialogFragment f70659OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f70660OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0Oo$OooO0o0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.ImportCloudDataDialogFragment$onViewCreated$6$5$1", m80623f = "ImportCloudDataDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImportCloudDataDialogFragment f70661OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f70661OooOo0o = importCloudDataDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f70661OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70661OooOo0o;
                    if (importCloudDataDialogFragment.getChildFragmentManager().OooOooo("CloudBackupResultDialogFragment") == null) {
                        importCloudDataDialogFragment.f70638Oooo0o0.show(importCloudDataDialogFragment.getChildFragmentManager(), "CloudBackupResultDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22998OooO0o0(ImportCloudDataDialogFragment importCloudDataDialogFragment, Continuation<? super C22998OooO0o0> continuation) {
                super(2, continuation);
                this.f70659OooOo = importCloudDataDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C22998OooO0o0(this.f70659OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C22998OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f70660OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImportCloudDataDialogFragment importCloudDataDialogFragment = this.f70659OooOo;
                    C33772OooooOo c33772OooooOo = importCloudDataDialogFragment.OooOoo0().f70705OooOo0o;
                    OooO00o oooO00o = new OooO00o(importCloudDataDialogFragment, null);
                    this.f70660OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C22997OooO0Oo(Continuation<? super C22997OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C22997OooO0Oo c22997OooO0Oo = ImportCloudDataDialogFragment.this.new C22997OooO0Oo(continuation);
            c22997OooO0Oo.f70646OooOo0o = obj;
            return c22997OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C22997OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f70646OooOo0o;
            ImportCloudDataDialogFragment importCloudDataDialogFragment = ImportCloudDataDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(importCloudDataDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(importCloudDataDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(importCloudDataDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19154OooO0Oo(importCloudDataDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C22998OooO0o0(importCloudDataDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ImportCloudDataDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C22999OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C22999OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ImportCloudDataDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.ImportCloudDataDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23000OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23000OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return ImportCloudDataDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final com.orion.notein.p607ui.backup.OooO00o OooOoo0() {
        return (com.orion.notein.p607ui.backup.OooO00o) this.f70630OooOooO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_batch_pdf_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.import_backup_files));
        ((SearchView) view.findViewById(R.id.search_box)).setOnQueryTextListener(new OooO0O0());
        this.f70633Oooo000 = (ViewGroup) view.findViewById(R.id.cl_bread_crumbs);
        TextView textView = (TextView) view.findViewById(R.id.bread_crumbs);
        this.f70634Oooo00O = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("txtBreadCrumbs");
            throw null;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = (TextView) view.findViewById(R.id.btn_cancel);
        this.f70635Oooo00o = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView2.setOnClickListener(new ViewOnClickListenerC28603OooO00o(this, 7));
        TextView textView3 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f70632Oooo0 = textView3;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView3.setText(getString(R.string._import));
        TextView textView4 = this.f70632Oooo0;
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView4, 500L, new ViewOnClickListenerC28989OooO00o(this, 5));
        C28082OooO00o c28082OooO00o = new C28082OooO00o(C28082OooO00o.C19888OooO00o.f99535OooO00o);
        this.f70631OooOooo = c28082OooO00o;
        c28082OooO00o.f99534OooO0O0 = new ViewOnClickListenerC28407OooO00o(this, 6);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C28082OooO00o c28082OooO00o2 = this.f70631OooOooo;
        if (c28082OooO00o2 == null) {
            OooOOO0.OooOOOO("noteinAdapter");
            throw null;
        }
        recyclerView.setAdapter(c28082OooO00o2);
        recyclerView.setItemAnimator(null);
        this.f70636Oooo0O0 = (ImageView) view.findViewById(R.id.iv_empty);
        this.f70637Oooo0OO = view.findViewById(R.id.v_loading);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C22997OooO0Oo(null), 3);
        OooOoo0().OooOO0();
    }
}
