package com.orion.notein.p607ui.noteeditor.pagepadding;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00Ooo.C25080OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0O0oooo.C26370OooOOOO;
import o0O0oooo.C26371OooOOOo;
import o0Oo00o.C28025OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0OoOOo.ViewOnClickListenerC29133OooO0oO;
import o0Ooo0Oo.C29404OooO00o;
import o0Ooo0Oo.C29407OooO0Oo;
import o0Ooo0Oo.C29409OooO0o0;
import o0Ooo0Oo.C29410OooO0oO;
import o0Ooo0o.C29415OooO0o;
import o0Ooo0o0.C29420OooO0Oo;
import o0Ooo0o0.C29421OooO0o0;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29430OooO0OO;
import o0Ooo0oO.C29431OooO0Oo;
import o0Ooo0oO.C29433OooO0o0;
import o0Ooo0oo.ViewOnClickListenerC29448OooOO0O;
import o0oOOO0o.C30827OooO0o;
import o0oOOO0o.C30831OooOO0;
import o0oOOO0o.C30832OooOO0O;
import o0oOOO0o.C30833OooOO0o;
import o0oOOO0o.C30835OooOOO0;
import o0oOOO0o.InterfaceC30836OooOOOO;
import o0oOOO0o.ViewOnTouchListenerC30822OooO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.OooOO0;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagepadding/PagePaddingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PagePaddingFragment extends Hilt_PagePaddingFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f74915OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Object f74916OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f74917OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f74918OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageView f74919Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ViewGroup f74920Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74921Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74922Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SingleSelectDropdownView f74923Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ViewGroup f74924Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f74925Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f74926Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f74927Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f74928Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f74929Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f74930OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f74931OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f74932OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f74933OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f74934OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f74935OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f74936OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f74937OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public View f74938OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public View f74939OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public C29404OooO00o f74940Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public C29415OooO0o f74941Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public RecyclerView f74942OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public C29409OooO0o0 f74943OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public RecyclerView f74944OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public TextView f74945Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public C29407OooO0Oo f74946Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public SeekBar f74947OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public TextView f74948Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f74949o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final RectF f74950o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final RectF f74951o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final PointF f74952o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final PointF f74953o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public Bitmap f74954o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public String f74955o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final AtomicBoolean f74956o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final ViewOnTouchListenerC30822OooO f74957o0OOO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public C29423OooO00o.C19987OooO00o f74958o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public Bitmap f74959o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public Bitmap f74960o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public o00000OO f74961o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final int f74962oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final RectF f74963ooOO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74964OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74964OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74964OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PagePaddingFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements View.OnLayoutChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            PagePaddingFragment pagePaddingFragment = PagePaddingFragment.this;
            InterfaceC21987OooOoo viewLifecycleOwner = pagePaddingFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, pagePaddingFragment.new OooO0OO(null), 3);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f74968OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$1", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74969OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74970OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19310OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74971OooOo0o;

                public C19310OooO00o(PagePaddingFragment pagePaddingFragment) {
                    this.f74971OooOo0o = pagePaddingFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    PagePaddingFragment pagePaddingFragment;
                    T next;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        pagePaddingFragment = this.f74971OooOo0o;
                        if (!zHasNext) {
                            break;
                        }
                        C29410OooO0oO c29410OooO0oO = (C29410OooO0oO) it.next();
                        String strValueOf = String.valueOf(c29410OooO0oO.f104291OooO00o);
                        String string = pagePaddingFragment.getString(c29410OooO0oO.f104291OooO00o);
                        OooOOO0.OooO0o(string, "getString(...)");
                        arrayList.add(new o0O0oo0.OooOOOO(strValueOf, string));
                    }
                    SingleSelectDropdownView singleSelectDropdownView = pagePaddingFragment.f74923Oooo00o;
                    if (singleSelectDropdownView == null) {
                        OooOOO0.OooOOOO("clPaperSpec");
                        throw null;
                    }
                    singleSelectDropdownView.setOptions(arrayList);
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it2.next();
                        if (((C29410OooO0oO) next).f104295OooO0o) {
                            break;
                        }
                    }
                    C29410OooO0oO c29410OooO0oO2 = next;
                    String strValueOf2 = c29410OooO0oO2 != null ? String.valueOf(c29410OooO0oO2.f104291OooO00o) : null;
                    if (c29410OooO0oO2 != null) {
                        pagePaddingFragment.getString(c29410OooO0oO2.f104291OooO00o);
                    }
                    SingleSelectDropdownView singleSelectDropdownView2 = pagePaddingFragment.f74923Oooo00o;
                    if (singleSelectDropdownView2 != null) {
                        singleSelectDropdownView2.setSelectedOptionId(strValueOf2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("clPaperSpec");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f74969OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f74969OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74970OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74969OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    C19310OooO00o c19310OooO00o = new C19310OooO00o(pagePaddingFragment);
                    this.f74970OooOo0o = 1;
                    if (c29423OooO00oOooOooO.f104378OooOo00.f121747OooOo0o.collect(c19310OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$2", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class C19311OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74972OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74973OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$2$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74974OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f74975OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f74974OooOo = pagePaddingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f74974OooOo, continuation);
                    oooO00o.f74975OooOo0o = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f74975OooOo0o;
                    View view = this.f74974OooOo.f74938OoooOoO;
                    if (view != null) {
                        view.setActivated(z);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnApplyToAll");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19311OooO0O0(PagePaddingFragment pagePaddingFragment, Continuation<? super C19311OooO0O0> continuation) {
                super(2, continuation);
                this.f74972OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19311OooO0O0(this.f74972OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19311OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74973OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74972OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
                    this.f74973OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104377OooOo0, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$3", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74976OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74977OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$3$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74978OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f74979OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f74978OooOo = pagePaddingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f74978OooOo, continuation);
                    oooO00o.f74979OooOo0o = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f74979OooOo0o;
                    View view = this.f74978OooOo.f74939OoooOoo;
                    if (view != null) {
                        view.setActivated(z);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("btnApplyToFirstPage");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f74976OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f74976OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74977OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74976OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
                    this.f74977OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104379OooOo0O, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$4", m80623f = "PagePaddingFragment.kt", m80624l = {304}, m80625m = "invokeSuspend")
        public static final class C23446OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74980OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74981OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74982OooOo0o;

                public OooO00o(PagePaddingFragment pagePaddingFragment) {
                    this.f74982OooOo0o = pagePaddingFragment;
                }

                /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, oO00ooO.OooOO0] */
                /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, oO00ooO.OooOO0] */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    PagePaddingFragment pagePaddingFragment = this.f74982OooOo0o;
                    if (iIntValue != 1) {
                        androidx.lifecycle.OooOOOO parentFragment = pagePaddingFragment.getParentFragment();
                        InterfaceC30836OooOOOO interfaceC30836OooOOOO = null;
                        InterfaceC30836OooOOOO interfaceC30836OooOOOO2 = parentFragment instanceof InterfaceC30836OooOOOO ? (InterfaceC30836OooOOOO) parentFragment : null;
                        if (interfaceC30836OooOOOO2 == null) {
                            KeyEventDispatcher.Component activity = pagePaddingFragment.getActivity();
                            if (activity instanceof InterfaceC30836OooOOOO) {
                                interfaceC30836OooOOOO = (InterfaceC30836OooOOOO) activity;
                            }
                        } else {
                            interfaceC30836OooOOOO = interfaceC30836OooOOOO2;
                        }
                        if (interfaceC30836OooOOOO != null) {
                            interfaceC30836OooOOOO.OooOOo((String) pagePaddingFragment.f74916OooOoo0.getValue(), (String) pagePaddingFragment.f74915OooOoo.getValue());
                        }
                    } else if (pagePaddingFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                        ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                        ViewOnClickListenerC29448OooOO0O viewOnClickListenerC29448OooOO0O = new ViewOnClickListenerC29448OooOO0O(pagePaddingFragment, 2);
                        String string = pagePaddingFragment.getString(R.string.tips);
                        OooOOO0.OooO0o(string, "getString(...)");
                        String string2 = pagePaddingFragment.getString(R.string.error_page_size_incompatible_and_skip);
                        OooOOO0.OooO0o(string2, "getString(...)");
                        new TipsDialogFragment(string, string2, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC29448OooOO0O).show(pagePaddingFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23446OooO0Oo(PagePaddingFragment pagePaddingFragment, Continuation<? super C23446OooO0Oo> continuation) {
                super(2, continuation);
                this.f74980OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23446OooO0Oo(this.f74980OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23446OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74981OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                PagePaddingFragment pagePaddingFragment = this.f74980OooOo;
                C33772OooooOo c33772OooooOo = pagePaddingFragment.OooOooO().f104383OooOoOO;
                OooO00o oooO00o = new OooO00o(pagePaddingFragment);
                this.f74981OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$6", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74983OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74984OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$6$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29421OooO0o0>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74985OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74986OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f74985OooOo = pagePaddingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f74985OooOo, continuation);
                    oooO00o.f74986OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29421OooO0o0> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f74986OooOo0o;
                    C29409OooO0o0 c29409OooO0o0 = this.f74985OooOo.f74943OooooOO;
                    if (c29409OooO0o0 != null) {
                        c29409OooO0o0.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("paddingPatternAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f74983OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f74983OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74984OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74983OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
                    this.f74984OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104375OooOOoo, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$5", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74987OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74988OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$5$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29420OooO0Oo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74989OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74990OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f74989OooOo = pagePaddingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f74989OooOo, continuation);
                    oooO00o.f74990OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29420OooO0Oo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f74990OooOo0o;
                    C29407OooO0Oo c29407OooO0Oo = this.f74989OooOo.f74946Oooooo0;
                    if (c29407OooO0Oo != null) {
                        c29407OooO0Oo.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("paddingLayoutAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f74987OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f74987OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74988OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74987OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
                    this.f74988OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104373OooOOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$7", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class C23447OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74991OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74992OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0O0$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$17$7$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29423OooO00o.C19987OooO00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74993OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74994OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f74993OooOo = pagePaddingFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f74993OooOo, continuation);
                    oooO00o.f74994OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C29423OooO00o.C19987OooO00o c19987OooO00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c19987OooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C29423OooO00o.C19987OooO00o c19987OooO00o = (C29423OooO00o.C19987OooO00o) this.f74994OooOo0o;
                    PagePaddingFragment pagePaddingFragment = this.f74993OooOo;
                    pagePaddingFragment.f74958o0OoOo0 = c19987OooO00o;
                    pagePaddingFragment.Oooo0(c19987OooO00o.f104387OooO0O0);
                    SeekBar seekBar = pagePaddingFragment.f74947OoooooO;
                    if (seekBar == null) {
                        OooOOO0.OooOOOO("itemSpaceSeekBar");
                        throw null;
                    }
                    if (seekBar.getMax() != 90) {
                        SeekBar seekBar2 = pagePaddingFragment.f74947OoooooO;
                        if (seekBar2 == null) {
                            OooOOO0.OooOOOO("itemSpaceSeekBar");
                            throw null;
                        }
                        seekBar2.setMax(90);
                    }
                    int i = c19987OooO00o.f104386OooO00o;
                    int iOooO0o = OooOO0.OooO0o(i - 10, 0, 90);
                    SeekBar seekBar3 = pagePaddingFragment.f74947OoooooO;
                    if (seekBar3 == null) {
                        OooOOO0.OooOOOO("itemSpaceSeekBar");
                        throw null;
                    }
                    if (seekBar3.getProgress() != iOooO0o) {
                        SeekBar seekBar4 = pagePaddingFragment.f74947OoooooO;
                        if (seekBar4 == null) {
                            OooOOO0.OooOOOO("itemSpaceSeekBar");
                            throw null;
                        }
                        seekBar4.setProgress(iOooO0o);
                    }
                    PagePaddingFragment.OooOoOO(pagePaddingFragment, i);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23447OooO0oO(PagePaddingFragment pagePaddingFragment, Continuation<? super C23447OooO0oO> continuation) {
                super(2, continuation);
                this.f74991OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23447OooO0oO(this.f74991OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23447OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74992OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74991OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(pagePaddingFragment, null);
                    this.f74992OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29423OooO00oOooOooO.f104382OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = PagePaddingFragment.this.new OooO0O0(continuation);
            oooO0O0.f74968OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f74968OooOo0o;
            PagePaddingFragment pagePaddingFragment = PagePaddingFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19311OooO0O0(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23446OooO0Oo(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(pagePaddingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23447OooO0oO(pagePaddingFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$18$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f74996OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$onViewCreated$18$1$1", m80623f = "PagePaddingFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f74997OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f74998OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19312OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PagePaddingFragment f74999OooOo0o;

                public C19312OooO00o(PagePaddingFragment pagePaddingFragment) {
                    this.f74999OooOo0o = pagePaddingFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Object objOooOoO;
                    Page page = (Page) obj;
                    return (page != null && (objOooOoO = PagePaddingFragment.OooOoO(this.f74999OooOo0o, page, continuation)) == EnumC32485OooO00o.f116726OooOo0o) ? objOooOoO : C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f74997OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f74997OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f74998OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PagePaddingFragment pagePaddingFragment = this.f74997OooOo;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    C19312OooO00o c19312OooO00o = new C19312OooO00o(pagePaddingFragment);
                    this.f74998OooOo0o = 1;
                    if (c29423OooO00oOooOooO.f104374OooOOo0.f121747OooOo0o.collect(c19312OooO00o, this) == enumC32485OooO00o) {
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

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = PagePaddingFragment.this.new OooO0OO(continuation);
            oooO0OO.f74996OooOo0o = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f74996OooOo0o, null, null, new OooO00o(PagePaddingFragment.this, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$refreshPagePaddingStyleThumbnail$1", m80623f = "PagePaddingFragment.kt", m80624l = {1716, 1717}, m80625m = "invokeSuspend")
    public static final class C23448OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C24034Oooo00O f75000OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C24034Oooo00O f75001OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Object f75002OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f75003OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ Rect f75004OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ PagePaddingFragment f75005OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ Page f75006OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ C33163OooO0oO f75007OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ float f75008OooOooo;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$refreshPagePaddingStyleThumbnail$1$1", m80623f = "PagePaddingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PagePaddingFragment f75009OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C24034Oooo00O<Bitmap> f75010OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C24034Oooo00O<Bitmap> c24034Oooo00O, PagePaddingFragment pagePaddingFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75010OooOo0o = c24034Oooo00O;
                this.f75009OooOo = pagePaddingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75010OooOo0o, this.f75009OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Bitmap bitmap = this.f75010OooOo0o.f80942OooOo0o;
                PagePaddingFragment pagePaddingFragment = this.f75009OooOo;
                Bitmap bitmap2 = pagePaddingFragment.f74960o0ooOOo;
                if (bitmap2 != null) {
                    PagePaddingFragment.Oooo000(bitmap2);
                }
                pagePaddingFragment.f74960o0ooOOo = bitmap;
                ImageView imageView = pagePaddingFragment.f74926Oooo0o;
                if (imageView == null) {
                    OooOOO0.OooOOOO("pagePaddingStyleThumbnail");
                    throw null;
                }
                RectF rectF = pagePaddingFragment.f74963ooOO;
                imageView.setX(rectF.left);
                ImageView imageView2 = pagePaddingFragment.f74926Oooo0o;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("pagePaddingStyleThumbnail");
                    throw null;
                }
                imageView2.setY(rectF.top);
                ImageView imageView3 = pagePaddingFragment.f74926Oooo0o;
                if (imageView3 == null) {
                    OooOOO0.OooOOOO("pagePaddingStyleThumbnail");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                layoutParams.width = oO0O00O.OooO00o.OooO0O0(rectF.width());
                layoutParams.height = oO0O00O.OooO00o.OooO0O0(rectF.height());
                ImageView imageView4 = pagePaddingFragment.f74926Oooo0o;
                if (imageView4 == null) {
                    OooOOO0.OooOOOO("pagePaddingStyleThumbnail");
                    throw null;
                }
                imageView4.setLayoutParams(layoutParams);
                ImageView imageView5 = pagePaddingFragment.f74926Oooo0o;
                if (imageView5 != null) {
                    imageView5.setImageBitmap(bitmap);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("pagePaddingStyleThumbnail");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23448OooO0Oo(Rect rect, Page page, PagePaddingFragment pagePaddingFragment, C33163OooO0oO c33163OooO0oO, float f, Continuation continuation) {
            super(2, continuation);
            this.f75004OooOoOO = rect;
            this.f75006OooOoo0 = page;
            this.f75005OooOoo = pagePaddingFragment;
            this.f75007OooOooO = c33163OooO0oO;
            this.f75008OooOooo = f;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C33163OooO0oO c33163OooO0oO = this.f75007OooOooO;
            C23448OooO0Oo c23448OooO0Oo = new C23448OooO0Oo(this.f75004OooOoOO, this.f75006OooOoo0, this.f75005OooOoo, c33163OooO0oO, this.f75008OooOooo, continuation);
            c23448OooO0Oo.f75002OooOoO = obj;
            return c23448OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23448OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C24034Oooo00O c24034Oooo00O;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o;
            Page pageOooOOO;
            InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
            T t;
            C24034Oooo00O c24034Oooo00O2;
            Throwable th;
            Bitmap bitmap;
            Bitmap bitmap2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75003OooOoO0;
            PagePaddingFragment pagePaddingFragment = this.f75005OooOoo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f75002OooOoO;
                c24034Oooo00O = new C24034Oooo00O();
                try {
                    Rect rect = this.f75004OooOoOO;
                    if (rect == null || (pageOooOOO = pagePaddingFragment.OooOooO().OooOOO(new Rect(rect))) == null) {
                        pageOooOOO = this.f75006OooOoo0;
                    }
                    Page page = pageOooOOO;
                    C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                    C33163OooO0oO c33163OooO0oO = this.f75007OooOooO;
                    float f = this.f75008OooOooo;
                    this.f75002OooOoO = interfaceC33636Oooo00o3;
                    this.f75001OooOo0o = c24034Oooo00O;
                    this.f75000OooOo = c24034Oooo00O;
                    this.f75003OooOoO0 = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29433OooO0o0(page, c33163OooO0oO, f, c29423OooO00oOooOooO, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                        t = objOooO0o;
                        c24034Oooo00O2 = c24034Oooo00O;
                    }
                    return enumC32485OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33636Oooo00o = interfaceC33636Oooo00o3;
                    th = th;
                    if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                        throw th;
                    }
                    throw th;
                }
            }
            if (i == 1) {
                c24034Oooo00O = this.f75000OooOo;
                c24034Oooo00O2 = this.f75001OooOo0o;
                interfaceC33636Oooo00o2 = (InterfaceC33636Oooo00o) this.f75002OooOoO;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    t = obj;
                } catch (Throwable th3) {
                    th = th3;
                    c24034Oooo00O = c24034Oooo00O2;
                    interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                    if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o) || (bitmap = (Bitmap) c24034Oooo00O.f80942OooOo0o) == null) {
                        throw th;
                    }
                    pagePaddingFragment.getClass();
                    PagePaddingFragment.Oooo000(bitmap);
                    throw th;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c24034Oooo00O = this.f75001OooOo0o;
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75002OooOoO;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    c24034Oooo00O.f80942OooOo0o = null;
                    if (!C33633Oooo0.OooO0o(interfaceC33636Oooo00o) && (bitmap2 = (Bitmap) c24034Oooo00O.f80942OooOo0o) != null) {
                        pagePaddingFragment.getClass();
                        PagePaddingFragment.Oooo000(bitmap2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    if (C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    }
                }
            }
            c24034Oooo00O.f80942OooOo0o = t;
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(c24034Oooo00O2, pagePaddingFragment, null);
            this.f75002OooOoO = interfaceC33636Oooo00o2;
            this.f75001OooOo0o = c24034Oooo00O2;
            this.f75000OooOo = null;
            this.f75003OooOoO0 = 2;
            if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, oooO00o, this) != enumC32485OooO00o) {
                c24034Oooo00O = c24034Oooo00O2;
                interfaceC33636Oooo00o = interfaceC33636Oooo00o2;
                c24034Oooo00O.f80942OooOo0o = null;
                if (!C33633Oooo0.OooO0o(interfaceC33636Oooo00o)) {
                    pagePaddingFragment.getClass();
                    PagePaddingFragment.Oooo000(bitmap2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23449OooO0o0 f75011OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23449OooO0o0 c23449OooO0o0) {
            super(0);
            this.f75011OooOo0o = c23449OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75011OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23449OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23449OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PagePaddingFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23450OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75013OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23450OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75013OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75013OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagepadding.PagePaddingFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23451OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75014OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23451OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75014OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75014OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o0oOOO0o.OooO] */
    public PagePaddingFragment() {
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        this.f74916OooOoo0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new oO0O000o.OooO00o() { // from class: o0oOOO0o.OooO0oO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                String string = this.f110179OooOo0o.requireArguments().getString("arg_note_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalStateException("noteId is required");
            }
        });
        this.f74915OooOoo = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new oO0O000o.OooO00o() { // from class: o0oOOO0o.OooO0oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                String string = this.f110180OooOo0o.requireArguments().getString("arg_page_id");
                if (string != null) {
                    return string;
                }
                throw new IllegalStateException("pageId is required");
            }
        });
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0o(new C23449OooO0o0()));
        this.f74917OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C29423OooO00o.class), new C23450OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23451OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f74963ooOO = new RectF();
        this.f74950o00O0O = new RectF();
        this.f74951o00Oo0 = new RectF();
        this.f74952o00Ooo = new PointF();
        this.f74953o00o0O = new PointF();
        this.f74956o00ooo = new AtomicBoolean(false);
        this.f74962oo000o = o000000O.OooO0o(16);
        this.f74957o0OOO0o = new View.OnTouchListener() { // from class: o0oOOO0o.OooO
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (r4 != 3) goto L68;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C29423OooO00o c29423OooO00oOooOooO;
                C29423OooO00o.OooO0O0 oooO0O0OooO0oO;
                float f;
                float f2;
                float fMin;
                float f3;
                float fMin2;
                PagePaddingFragment pagePaddingFragment = this.f110169OooOo0o;
                Page page = (Page) pagePaddingFragment.OooOooO().f104374OooOOo0.f121747OooOo0o.getValue();
                if (page == null) {
                    return false;
                }
                int action = motionEvent.getAction();
                PointF pointF = pagePaddingFragment.f74953o00o0O;
                if (action == 0) {
                    ViewGroup viewGroup = pagePaddingFragment.f74920Oooo0;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                        throw null;
                    }
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    pagePaddingFragment.f74952o00Ooo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
                    TextView textView = pagePaddingFragment.f74927Oooo0o0;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                        throw null;
                    }
                    textView.setVisibility(8);
                    TextView textView2 = pagePaddingFragment.f74927Oooo0o0;
                    if (textView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                        throw null;
                    }
                    textView2.setTag(null);
                    pagePaddingFragment.Oooo00o(page);
                    return true;
                }
                if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX() - pointF.x;
                        float rawY = motionEvent.getRawY() - pointF.y;
                        pointF.set(motionEvent.getRawX(), motionEvent.getRawY());
                        int id = view.getId();
                        if (id != R.id.move_center) {
                            switch (id) {
                                case R.id.scale_bottom /* 2131298663 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 8);
                                    return true;
                                case R.id.scale_bottom_left /* 2131298664 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 9);
                                    return true;
                                case R.id.scale_bottom_right /* 2131298665 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 10);
                                    return true;
                                case R.id.scale_left /* 2131298666 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 1);
                                    return true;
                                case R.id.scale_right /* 2131298667 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 2);
                                    return true;
                                case R.id.scale_top /* 2131298668 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 4);
                                    return true;
                                case R.id.scale_top_left /* 2131298669 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 5);
                                    return true;
                                case R.id.scale_top_right /* 2131298670 */:
                                    pagePaddingFragment.OooOooo(rawX, rawY, 6);
                                    return true;
                            }
                        }
                        RectF rectF = new RectF(pagePaddingFragment.f74951o00Oo0);
                        float f4 = pagePaddingFragment.f74962oo000o;
                        float f5 = f4 * 1.0f;
                        if (pagePaddingFragment.f74920Oooo0 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                            throw null;
                        }
                        float width = (r14.getWidth() * 1.0f) - f4;
                        if (pagePaddingFragment.f74920Oooo0 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                            throw null;
                        }
                        RectF rectF2 = new RectF(f5, f5, width, (1.0f * r15.getHeight()) - f4);
                        RectF rectF3 = pagePaddingFragment.f74963ooOO;
                        if (rawX < 0.0f) {
                            float f6 = rectF2.left;
                            f2 = rectF3.left;
                            f = 0.0f;
                            fMin = Math.max(rawX, Math.max(f6 - f2, rectF.right - rectF3.right));
                        } else {
                            f = 0.0f;
                            float f7 = rectF2.right - rectF3.right;
                            float f8 = rectF.left;
                            f2 = rectF3.left;
                            fMin = Math.min(rawX, Math.min(f7, f8 - f2));
                        }
                        float f9 = fMin + f2;
                        if (rawY < f) {
                            float f10 = rectF2.top;
                            f3 = rectF3.top;
                            fMin2 = Math.max(rawY, Math.max(f10 - f3, rectF.bottom - rectF3.bottom));
                        } else {
                            float f11 = rectF2.bottom - rectF3.bottom;
                            float f12 = rectF.top;
                            f3 = rectF3.top;
                            fMin2 = Math.min(rawY, Math.min(f11, f12 - f3));
                        }
                        float f13 = fMin2 + f3;
                        RectF rectF4 = new RectF(f9, f13, rectF3.width() + f9, rectF3.height() + f13);
                        rectF3.set(rectF4);
                        View view2 = pagePaddingFragment.f74925Oooo0OO;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                            throw null;
                        }
                        view2.setX(rectF4.left);
                        View view3 = pagePaddingFragment.f74925Oooo0OO;
                        if (view3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                            throw null;
                        }
                        view3.setY(rectF4.top);
                        RectF rectF5 = new RectF(rectF3.left - f4, rectF3.top - f4, rectF3.right + f4, rectF3.bottom + f4);
                        pagePaddingFragment.f74950o00O0O.set(rectF5);
                        ViewGroup viewGroup2 = pagePaddingFragment.f74924Oooo0O0;
                        if (viewGroup2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                            throw null;
                        }
                        viewGroup2.setX(rectF5.left);
                        ViewGroup viewGroup3 = pagePaddingFragment.f74924Oooo0O0;
                        if (viewGroup3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                            throw null;
                        }
                        viewGroup3.setY(rectF5.top);
                        pagePaddingFragment.Oooo0O0();
                        TextView textView3 = pagePaddingFragment.f74927Oooo0o0;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                            throw null;
                        }
                        textView3.setVisibility(8);
                        Page page2 = (Page) pagePaddingFragment.OooOooO().f104374OooOOo0.f121747OooOo0o.getValue();
                        if (page2 != null) {
                            TextView textView4 = pagePaddingFragment.f74927Oooo0o0;
                            if (textView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                                throw null;
                            }
                            Object tag = textView4.getTag();
                            pagePaddingFragment.Oooo00O(page2, pagePaddingFragment.OooOoo0(), tag instanceof Rect ? (Rect) tag : null);
                            return true;
                        }
                    }
                    return true;
                }
                ViewGroup viewGroup4 = pagePaddingFragment.f74920Oooo0;
                if (viewGroup4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                    throw null;
                }
                viewGroup4.requestDisallowInterceptTouchEvent(false);
                TextView textView5 = pagePaddingFragment.f74927Oooo0o0;
                if (textView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                    throw null;
                }
                Object tag2 = textView5.getTag();
                Rect rect = tag2 instanceof Rect ? (Rect) tag2 : null;
                if (rect != null && (oooO0O0OooO0oO = (c29423OooO00oOooOooO = pagePaddingFragment.OooOooO()).OooO0oO(rect)) != null) {
                    C33781o00o0O c33781o00o0O = c29423OooO00oOooOooO.f104368OooOO0o;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, oooO0O0OooO0oO);
                }
                TextView textView6 = pagePaddingFragment.f74927Oooo0o0;
                if (textView6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                    throw null;
                }
                textView6.setVisibility(8);
                TextView textView7 = pagePaddingFragment.f74927Oooo0o0;
                if (textView7 != null) {
                    textView7.setTag(null);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(final PagePaddingFragment pagePaddingFragment, final Page page, Continuation continuation) throws Throwable {
        C30835OooOOO0 c30835OooOOO0;
        Context context;
        final float fOooOoo0;
        PagePaddingFragment pagePaddingFragment2;
        Page page2;
        float f;
        PagePaddingFragment pagePaddingFragment3;
        Page page3;
        Bitmap bitmap;
        ImageView imageView;
        if (continuation instanceof C30835OooOOO0) {
            c30835OooOOO0 = (C30835OooOOO0) continuation;
            int i = c30835OooOOO0.f110194OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30835OooOOO0.f110194OooOooO = i - Integer.MIN_VALUE;
            } else {
                c30835OooOOO0 = new C30835OooOOO0(pagePaddingFragment, continuation);
            }
        }
        Object objOooO0o = c30835OooOOO0.f110193OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30835OooOOO0.f110194OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            context = pagePaddingFragment.getContext();
            if (context == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            boolean zCompareAndSet = pagePaddingFragment.f74956o00ooo.compareAndSet(false, true);
            fOooOoo0 = pagePaddingFragment.OooOoo0();
            if (zCompareAndSet || !OooOOO0.OooO0O0(pagePaddingFragment.f74955o00oO0o, page.getId())) {
                Bitmap bitmap2 = pagePaddingFragment.f74954o00oO0O;
                if (bitmap2 != null) {
                    Oooo000(bitmap2);
                }
                Bitmap bitmap3 = pagePaddingFragment.f74959o0ooOO0;
                if (bitmap3 != null) {
                    Oooo000(bitmap3);
                }
                C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                c30835OooOOO0.f110188OooOo0o = pagePaddingFragment;
                c30835OooOOO0.f110187OooOo = page;
                c30835OooOOO0.f110190OooOoO0 = context;
                c30835OooOOO0.f110189OooOoO = pagePaddingFragment;
                c30835OooOOO0.f110191OooOoOO = fOooOoo0;
                c30835OooOOO0.f110194OooOooO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29430OooO0OO(page, (C33163OooO0oO) context, fOooOoo0, c29423OooO00oOooOooO, null), c30835OooOOO0);
                if (objOooO0o != enumC32485OooO00o) {
                    pagePaddingFragment2 = pagePaddingFragment;
                    page2 = page;
                    f = fOooOoo0;
                }
                return enumC32485OooO00o;
            }
            bitmap = pagePaddingFragment.f74954o00oO0O;
            if (bitmap != null) {
            }
            imageView = pagePaddingFragment.f74928Oooo0oO;
            if (imageView != null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f2 = c30835OooOOO0.f110191OooOoOO;
                pagePaddingFragment3 = (PagePaddingFragment) c30835OooOOO0.f110190OooOoO0;
                page3 = c30835OooOOO0.f110187OooOo;
                PagePaddingFragment pagePaddingFragment4 = c30835OooOOO0.f110188OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                f = f2;
                pagePaddingFragment = pagePaddingFragment4;
                pagePaddingFragment3.f74959o0ooOO0 = (Bitmap) objOooO0o;
                pagePaddingFragment.f74955o00oO0o = page3.getId();
                page = page3;
                fOooOoo0 = f;
                bitmap = pagePaddingFragment.f74954o00oO0O;
                if (bitmap != null) {
                    ImageView imageView2 = pagePaddingFragment.f74928Oooo0oO;
                    if (imageView2 == null) {
                        OooOOO0.OooOOOO("pageContentThumbnail");
                        throw null;
                    }
                    imageView2.setImageBitmap(bitmap);
                }
                imageView = pagePaddingFragment.f74928Oooo0oO;
                if (imageView != null) {
                    imageView.post(new Runnable() { // from class: o0oOOO0o.OooO0o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PagePaddingFragment pagePaddingFragment5 = this.f110177OooOo0o;
                            Page page4 = page;
                            pagePaddingFragment5.Oooo00o(page4);
                            ViewGroup viewGroup = pagePaddingFragment5.f74924Oooo0O0;
                            if (viewGroup == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                                throw null;
                            }
                            RectF rectF = pagePaddingFragment5.f74950o00O0O;
                            viewGroup.setX(rectF.left);
                            ViewGroup viewGroup2 = pagePaddingFragment5.f74924Oooo0O0;
                            if (viewGroup2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                                throw null;
                            }
                            viewGroup2.setY(rectF.top);
                            ViewGroup viewGroup3 = pagePaddingFragment5.f74924Oooo0O0;
                            if (viewGroup3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                            layoutParams.width = oO0O00O.OooO00o.OooO0O0(rectF.width());
                            layoutParams.height = oO0O00O.OooO00o.OooO0O0(rectF.height());
                            ViewGroup viewGroup4 = pagePaddingFragment5.f74924Oooo0O0;
                            if (viewGroup4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                                throw null;
                            }
                            viewGroup4.setLayoutParams(layoutParams);
                            View view = pagePaddingFragment5.f74925Oooo0OO;
                            if (view == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                                throw null;
                            }
                            RectF rectF2 = pagePaddingFragment5.f74963ooOO;
                            view.setX(rectF2.left);
                            View view2 = pagePaddingFragment5.f74925Oooo0OO;
                            if (view2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                                throw null;
                            }
                            view2.setY(rectF2.top);
                            View view3 = pagePaddingFragment5.f74925Oooo0OO;
                            if (view3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                            layoutParams2.width = oO0O00O.OooO00o.OooO0O0(rectF2.width());
                            layoutParams2.height = oO0O00O.OooO00o.OooO0O0(rectF2.height());
                            View view4 = pagePaddingFragment5.f74925Oooo0OO;
                            if (view4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                                throw null;
                            }
                            view4.setLayoutParams(layoutParams2);
                            ViewGroup viewGroup5 = pagePaddingFragment5.f74924Oooo0O0;
                            if (viewGroup5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingEditor");
                                throw null;
                            }
                            viewGroup5.setVisibility(0);
                            View view5 = pagePaddingFragment5.f74925Oooo0OO;
                            if (view5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("paddingIndicator");
                                throw null;
                            }
                            view5.setVisibility(0);
                            ViewGroup viewGroup6 = pagePaddingFragment5.f74920Oooo0;
                            if (viewGroup6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                                throw null;
                            }
                            viewGroup6.requestLayout();
                            ImageView imageView3 = pagePaddingFragment5.f74919Oooo;
                            if (imageView3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageDisplayItems");
                                throw null;
                            }
                            float f3 = pagePaddingFragment5.f74962oo000o;
                            float f4 = 1.0f * f3;
                            imageView3.setX(f4);
                            ImageView imageView4 = pagePaddingFragment5.f74919Oooo;
                            if (imageView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageDisplayItems");
                                throw null;
                            }
                            imageView4.setY(f4);
                            ImageView imageView5 = pagePaddingFragment5.f74919Oooo;
                            if (imageView5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageDisplayItems");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams3 = imageView5.getLayoutParams();
                            if (pagePaddingFragment5.f74920Oooo0 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                                throw null;
                            }
                            float f5 = f3 * 2.0f;
                            layoutParams3.width = oO0O00O.OooO00o.OooO0O0(r7.getWidth() - f5);
                            if (pagePaddingFragment5.f74920Oooo0 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clEditorContainer");
                                throw null;
                            }
                            layoutParams3.height = oO0O00O.OooO00o.OooO0O0(r7.getHeight() - f5);
                            ImageView imageView6 = pagePaddingFragment5.f74919Oooo;
                            if (imageView6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageDisplayItems");
                                throw null;
                            }
                            imageView6.setLayoutParams(layoutParams3);
                            Bitmap bitmap4 = pagePaddingFragment5.f74959o0ooOO0;
                            if (bitmap4 != null) {
                                ImageView imageView7 = pagePaddingFragment5.f74919Oooo;
                                if (imageView7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageDisplayItems");
                                    throw null;
                                }
                                imageView7.setImageBitmap(bitmap4);
                            }
                            pagePaddingFragment5.Oooo00O(page4, fOooOoo0, null);
                            ImageView imageView8 = pagePaddingFragment5.f74929Oooo0oo;
                            if (imageView8 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageContentIndicator");
                                throw null;
                            }
                            RectF rectF3 = pagePaddingFragment5.f74951o00Oo0;
                            imageView8.setX(rectF3.left);
                            ImageView imageView9 = pagePaddingFragment5.f74929Oooo0oo;
                            if (imageView9 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageContentIndicator");
                                throw null;
                            }
                            imageView9.setY(rectF3.top);
                            ImageView imageView10 = pagePaddingFragment5.f74929Oooo0oo;
                            if (imageView10 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageContentIndicator");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams4 = imageView10.getLayoutParams();
                            layoutParams4.width = oO0O00O.OooO00o.OooO0O0(rectF3.width());
                            layoutParams4.height = oO0O00O.OooO00o.OooO0O0(rectF3.height());
                            ImageView imageView11 = pagePaddingFragment5.f74929Oooo0oo;
                            if (imageView11 != null) {
                                imageView11.setLayoutParams(layoutParams4);
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("pageContentIndicator");
                                throw null;
                            }
                        }
                    });
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("pageContentThumbnail");
                throw null;
            }
            float f3 = c30835OooOOO0.f110191OooOoOO;
            PagePaddingFragment pagePaddingFragment5 = c30835OooOOO0.f110189OooOoO;
            context = (Context) c30835OooOOO0.f110190OooOoO0;
            Page page4 = c30835OooOOO0.f110187OooOo;
            pagePaddingFragment2 = c30835OooOOO0.f110188OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            f = f3;
            pagePaddingFragment = pagePaddingFragment5;
            page2 = page4;
        }
        Context context2 = context;
        pagePaddingFragment.f74954o00oO0O = (Bitmap) objOooO0o;
        C29423OooO00o c29423OooO00oOooOooO2 = pagePaddingFragment2.OooOooO();
        c30835OooOOO0.f110188OooOo0o = pagePaddingFragment2;
        c30835OooOOO0.f110187OooOo = page2;
        c30835OooOOO0.f110190OooOoO0 = pagePaddingFragment2;
        c30835OooOOO0.f110189OooOoO = null;
        c30835OooOOO0.f110191OooOoOO = f;
        c30835OooOOO0.f110194OooOooO = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29431OooO0Oo(page2, context2, f, c29423OooO00oOooOooO2, null), c30835OooOOO0);
        if (objOooO0o != enumC32485OooO00o) {
            pagePaddingFragment = pagePaddingFragment2;
            pagePaddingFragment3 = pagePaddingFragment;
            page3 = page2;
            pagePaddingFragment3.f74959o0ooOO0 = (Bitmap) objOooO0o;
            pagePaddingFragment.f74955o00oO0o = page3.getId();
            page = page3;
            fOooOoo0 = f;
            bitmap = pagePaddingFragment.f74954o00oO0O;
            if (bitmap != null) {
            }
            imageView = pagePaddingFragment.f74928Oooo0oO;
            if (imageView != null) {
            }
        }
        return enumC32485OooO00o;
    }

    public static final void OooOoOO(PagePaddingFragment pagePaddingFragment, int i) {
        String strValueOf = String.valueOf(i);
        TextView textView = pagePaddingFragment.f74948Ooooooo;
        if (textView == null) {
            OooOOO0.OooOOOO("tvItemSpaceValue");
            throw null;
        }
        if (OooOOO0.OooO0O0(textView.getText().toString(), strValueOf)) {
            return;
        }
        TextView textView2 = pagePaddingFragment.f74948Ooooooo;
        if (textView2 != null) {
            textView2.setText(strValueOf);
        } else {
            OooOOO0.OooOOOO("tvItemSpaceValue");
            throw null;
        }
    }

    public static void Oooo000(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public final float OooOoo() {
        if (this.f74920Oooo0 != null) {
            return ((r0.getHeight() - (this.f74962oo000o * 2)) * 1.0f) / 5000;
        }
        OooOOO0.OooOOOO("clEditorContainer");
        throw null;
    }

    public final float OooOoo0() {
        if (this.f74920Oooo0 != null) {
            return ((r0.getWidth() - (this.f74962oo000o * 2)) * 1.0f) / 5000;
        }
        OooOOO0.OooOOOO("clEditorContainer");
        throw null;
    }

    public final C29423OooO00o OooOooO() {
        return (C29423OooO00o) this.f74917OooOooO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo(float f, float f2, int i) {
        RectF rectF = new RectF(this.f74951o00Oo0);
        float f3 = this.f74962oo000o;
        float f4 = f3 * 1.0f;
        if (this.f74920Oooo0 == null) {
            OooOOO0.OooOOOO("clEditorContainer");
            throw null;
        }
        float width = (r6.getWidth() * 1.0f) - f3;
        if (this.f74920Oooo0 == null) {
            OooOOO0.OooOOOO("clEditorContainer");
            throw null;
        }
        RectF rectF2 = new RectF(f4, f4, width, (1.0f * r9.getHeight()) - f3);
        View view = this.f74925Oooo0OO;
        if (view == null) {
            OooOOO0.OooOOOO("paddingIndicator");
            throw null;
        }
        RectF rectF3 = this.f74963ooOO;
        RectF rectF4 = new RectF(rectF3);
        RectF rectF5 = new RectF(rectF4);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = i & 1;
        if (i2 != 0) {
            float fOooO0o0 = OooOO0.OooO0o0(rectF4.left + f, rectF2.left, rectF.left);
            rectF5.left = fOooO0o0;
            layoutParams.width = oO0O00O.OooO00o.OooO0O0(rectF5.width());
            view.setX(fOooO0o0);
        }
        int i3 = i & 4;
        if (i3 != 0) {
            float fOooO0o02 = OooOO0.OooO0o0(rectF4.top + f2, rectF2.top, rectF.top);
            rectF5.top = fOooO0o02;
            view.setY(fOooO0o02);
            layoutParams.height = oO0O00O.OooO00o.OooO0O0(rectF5.height());
        }
        int i4 = i & 2;
        if (i4 != 0) {
            rectF5.right = OooOO0.OooO0o0(rectF4.right + f, rectF.right, rectF2.right);
            layoutParams.width = oO0O00O.OooO00o.OooO0O0(rectF5.width());
        }
        int i5 = i & 8;
        if (i5 != 0) {
            rectF5.bottom = OooOO0.OooO0o0(rectF4.bottom + f2, rectF.bottom, rectF2.bottom);
            layoutParams.height = oO0O00O.OooO00o.OooO0O0(rectF5.height());
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        rectF3.set(rectF5);
        RectF rectF6 = new RectF(rectF3.left - f3, rectF3.top - f3, rectF3.right + f3, rectF3.bottom + f3);
        this.f74950o00O0O.set(rectF6);
        ViewGroup viewGroup = this.f74924Oooo0O0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("paddingEditor");
            throw null;
        }
        viewGroup.setX(rectF6.left);
        ViewGroup viewGroup2 = this.f74924Oooo0O0;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("paddingEditor");
            throw null;
        }
        viewGroup2.setY(rectF6.top);
        ViewGroup viewGroup3 = this.f74924Oooo0O0;
        if (viewGroup3 == null) {
            OooOOO0.OooOOOO("paddingEditor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
        layoutParams2.width = oO0O00O.OooO00o.OooO0O0(rectF6.width());
        layoutParams2.height = oO0O00O.OooO00o.OooO0O0(rectF6.height());
        ViewGroup viewGroup4 = this.f74924Oooo0O0;
        if (viewGroup4 == null) {
            OooOOO0.OooOOOO("paddingEditor");
            throw null;
        }
        viewGroup4.setLayoutParams(layoutParams2);
        ViewGroup viewGroup5 = this.f74924Oooo0O0;
        if (viewGroup5 == null) {
            OooOOO0.OooOOOO("paddingEditor");
            throw null;
        }
        viewGroup5.requestLayout();
        Oooo0O0();
        float f5 = rectF3.left;
        float f6 = rectF3.top;
        float fWidth = rectF3.width();
        float fHeight = rectF3.height();
        float fOooO0o03 = o000000O.OooO0o0(15.0f);
        if (i2 != 0 && i3 != 0) {
            TextView textView = this.f74927Oooo0o0;
            if (textView == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView.setX(f5 + fOooO0o03);
            TextView textView2 = this.f74927Oooo0o0;
            if (textView2 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView2.setY(f6 + fOooO0o03);
        }
        if (i4 != 0 && i3 != 0) {
            TextView textView3 = this.f74927Oooo0o0;
            if (textView3 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView3.setX(((f5 + fWidth) - textView3.getWidth()) - fOooO0o03);
            TextView textView4 = this.f74927Oooo0o0;
            if (textView4 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView4.setY(f6 + fOooO0o03);
        }
        if (i2 != 0 && i5 != 0) {
            TextView textView5 = this.f74927Oooo0o0;
            if (textView5 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView5.setX(f5 + fOooO0o03);
            TextView textView6 = this.f74927Oooo0o0;
            if (textView6 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView6.setY(((f6 + fHeight) - textView6.getHeight()) - fOooO0o03);
        }
        if (i4 != 0 && i5 != 0) {
            TextView textView7 = this.f74927Oooo0o0;
            if (textView7 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView7.setX(((f5 + fWidth) - textView7.getWidth()) - fOooO0o03);
            TextView textView8 = this.f74927Oooo0o0;
            if (textView8 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView8.setY(((f6 + fHeight) - textView8.getHeight()) - fOooO0o03);
        }
        if (i2 != 0) {
            TextView textView9 = this.f74927Oooo0o0;
            if (textView9 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView9.setX(f5 + fOooO0o03);
            TextView textView10 = this.f74927Oooo0o0;
            if (textView10 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView10.setY(((fHeight / 2.0f) + f6) - (textView10.getHeight() / 2.0f));
        }
        if (i4 != 0) {
            TextView textView11 = this.f74927Oooo0o0;
            if (textView11 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView11.setX(((f5 + fWidth) - textView11.getWidth()) - fOooO0o03);
            TextView textView12 = this.f74927Oooo0o0;
            if (textView12 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView12.setY(((fHeight / 2.0f) + f6) - (textView12.getHeight() / 2.0f));
        }
        if (i3 != 0) {
            TextView textView13 = this.f74927Oooo0o0;
            if (textView13 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView13.setX(((fWidth / 2.0f) + f5) - (textView13.getWidth() / 2.0f));
            TextView textView14 = this.f74927Oooo0o0;
            if (textView14 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView14.setY(f6 + fOooO0o03);
        }
        if (i5 != 0) {
            TextView textView15 = this.f74927Oooo0o0;
            if (textView15 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView15.setX(((fWidth / 2.0f) + f5) - (textView15.getWidth() / 2.0f));
            TextView textView16 = this.f74927Oooo0o0;
            if (textView16 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView16.setY(((f6 + fHeight) - textView16.getHeight()) - fOooO0o03);
        }
        TextView textView17 = this.f74927Oooo0o0;
        if (textView17 == null) {
            OooOOO0.OooOOOO("pageSizeIndicator");
            throw null;
        }
        textView17.setVisibility(0);
        Page page = (Page) OooOooO().f104374OooOOo0.f121747OooOo0o.getValue();
        if (page != null) {
            TextView textView18 = this.f74927Oooo0o0;
            if (textView18 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            Object tag = textView18.getTag();
            Oooo00O(page, OooOoo0(), tag instanceof Rect ? (Rect) tag : null);
        }
    }

    public final void Oooo0(boolean z) {
        SeekBar seekBar = this.f74947OoooooO;
        if (seekBar == null) {
            OooOOO0.OooOOOO("itemSpaceSeekBar");
            throw null;
        }
        seekBar.setEnabled(z);
        TextView textView = this.f74945Oooooo;
        if (textView == null) {
            OooOOO0.OooOOOO("tvItemSpaceLabel");
            throw null;
        }
        textView.setEnabled(z);
        TextView textView2 = this.f74948Ooooooo;
        if (textView2 == null) {
            OooOOO0.OooOOOO("tvItemSpaceValue");
            throw null;
        }
        textView2.setEnabled(z);
        float f = z ? 1.0f : 0.4f;
        TextView textView3 = this.f74945Oooooo;
        if (textView3 == null) {
            OooOOO0.OooOOOO("tvItemSpaceLabel");
            throw null;
        }
        if (textView3.getAlpha() != f) {
            TextView textView4 = this.f74945Oooooo;
            if (textView4 == null) {
                OooOOO0.OooOOOO("tvItemSpaceLabel");
                throw null;
            }
            textView4.setAlpha(f);
        }
        TextView textView5 = this.f74948Ooooooo;
        if (textView5 == null) {
            OooOOO0.OooOOOO("tvItemSpaceValue");
            throw null;
        }
        if (textView5.getAlpha() == f) {
            return;
        }
        TextView textView6 = this.f74948Ooooooo;
        if (textView6 != null) {
            textView6.setAlpha(f);
        } else {
            OooOOO0.OooOOOO("tvItemSpaceValue");
            throw null;
        }
    }

    public final void Oooo00O(Page page, float f, Rect rect) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        o00000OO o00000oo2 = this.f74961o0ooOoO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f74961o0ooOoO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23448OooO0Oo(rect, page, this, (C33163OooO0oO) context, f, null), 3);
    }

    public final void Oooo00o(Page page) {
        float fFloatValue;
        float fFloatValue2;
        float fOooOoo0 = OooOoo0();
        float fOooOoo = OooOoo();
        C32443OooOOO<Float, Float> rotatedPrecisePageSize = page.getRotatedPrecisePageSize();
        if (rotatedPrecisePageSize == null) {
            C32443OooOOO<Integer, Integer> rotatedPageSize = page.getRotatedPageSize();
            fFloatValue = rotatedPageSize.f116638OooOo0o.intValue();
            fFloatValue2 = rotatedPageSize.f116637OooOo.intValue();
        } else {
            fFloatValue = rotatedPrecisePageSize.f116638OooOo0o.floatValue();
            fFloatValue2 = rotatedPrecisePageSize.f116637OooOo.floatValue();
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        float f = rotatedPaperPadding.left;
        float f2 = (fFloatValue - f) - rotatedPaperPadding.right;
        float f3 = rotatedPaperPadding.top;
        float f4 = (fFloatValue2 - f3) - rotatedPaperPadding.bottom;
        float f5 = fFloatValue * fOooOoo0;
        float f6 = fFloatValue2 * fOooOoo;
        float f7 = f * fOooOoo0;
        float f8 = f3 * fOooOoo;
        RectF rectF = this.f74951o00Oo0;
        rectF.setEmpty();
        if (this.f74920Oooo0 == null) {
            OooOOO0.OooOOOO("clEditorContainer");
            throw null;
        }
        rectF.left = (r8.getWidth() / 2.0f) - ((f2 / 2.0f) * fOooOoo0);
        if (this.f74920Oooo0 == null) {
            OooOOO0.OooOOOO("clEditorContainer");
            throw null;
        }
        float height = (r8.getHeight() / 2.0f) - ((f4 / 2.0f) * fOooOoo);
        rectF.top = height;
        rectF.right = (f2 * fOooOoo0) + rectF.left;
        rectF.bottom = (f4 * fOooOoo) + height;
        RectF rectF2 = this.f74963ooOO;
        rectF2.setEmpty();
        RectF rectF3 = this.f74950o00O0O;
        rectF3.setEmpty();
        float f9 = rectF.left - f7;
        int i = this.f74962oo000o;
        float f10 = i;
        rectF3.left = f9 - f10;
        rectF3.top = (rectF.top - f8) - f10;
        float f11 = rectF.left - f7;
        rectF2.left = f11;
        float f12 = rectF.top - f8;
        rectF2.top = f12;
        float f13 = i * 2;
        rectF3.right = rectF3.left + f5 + f13;
        rectF3.bottom = rectF3.top + f6 + f13;
        rectF2.right = f11 + f5;
        rectF2.bottom = f12 + f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0O0() {
        SizeF sizeF;
        Page page = (Page) OooOooO().f104374OooOOo0.f121747OooOo0o.getValue();
        if (page == null) {
            return;
        }
        C32443OooOOO<Integer, Integer> rotatedPageSize = page.getRotatedPageSize();
        int iIntValue = rotatedPageSize.f116638OooOo0o.intValue();
        int iIntValue2 = rotatedPageSize.f116637OooOo.intValue();
        page.getRotatedPrecisePageSize();
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        float fOooOoo0 = OooOoo0();
        float fOooOoo = OooOoo();
        int i = (iIntValue - rotatedPaperPadding.left) - rotatedPaperPadding.right;
        int i2 = (iIntValue2 - rotatedPaperPadding.top) - rotatedPaperPadding.bottom;
        RectF rectF = this.f74963ooOO;
        float fHeight = rectF.height();
        int iOooO0o = OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(rectF.width() / fOooOoo0), i > 5000 ? 5000 : i, 5000);
        int iOooO0o2 = OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(fHeight / fOooOoo), i2 > 5000 ? 5000 : i2, 5000);
        RectF rectF2 = this.f74951o00Oo0;
        float f = rectF2.left;
        float f2 = rectF.left;
        float f3 = rectF2.top;
        float f4 = rectF.top;
        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0((5000 - i) / 2.0f);
        int iOooO0O02 = oO0O00O.OooO00o.OooO0O0((5000 - i2) / 2.0f);
        int iOooO0o3 = OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0((f - f2) / fOooOoo0), 0, iOooO0O0);
        int i3 = (iOooO0o - i) - iOooO0o3;
        int iOooO0o4 = OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0((f3 - f4) / fOooOoo), 0, iOooO0O02);
        int i4 = (iOooO0o2 - i2) - iOooO0o4;
        TextView textView = this.f74927Oooo0o0;
        if (textView == null) {
            OooOOO0.OooOOOO("pageSizeIndicator");
            throw null;
        }
        textView.setTag(new Rect(iOooO0o3, iOooO0o4, i3, i4));
        OooOooO();
        o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
        oooOO02.getClass();
        C32443OooOOO<Float, Float> rotatedPrecisePageSize = page.getRotatedPrecisePageSize();
        if (rotatedPrecisePageSize == null) {
            sizeF = null;
        } else {
            Rect rotatedPaperPadding2 = page.getRotatedPaperPadding();
            sizeF = new SizeF((rotatedPrecisePageSize.f116638OooOo0o.floatValue() - rotatedPaperPadding2.left) - rotatedPaperPadding2.right, (rotatedPrecisePageSize.f116637OooOo.floatValue() - rotatedPaperPadding2.top) - rotatedPaperPadding2.bottom);
        }
        C32443OooOOO c32443OooOOO = sizeF == null ? null : new C32443OooOOO(Float.valueOf(sizeF.getWidth()), Float.valueOf(sizeF.getHeight()));
        if (c32443OooOOO != null) {
            float fFloatValue = ((Number) c32443OooOOO.f116638OooOo0o).floatValue() + iOooO0o3 + i3;
            float fFloatValue2 = ((Number) c32443OooOOO.f116637OooOo).floatValue() + iOooO0o4 + i4;
            int iOooO0O03 = oO0O00O.OooO00o.OooO0O0(OooOooO().OooOOoo(fFloatValue));
            int iOooO0O04 = oO0O00O.OooO00o.OooO0O0(OooOooO().OooOOoo(fFloatValue2));
            TextView textView2 = this.f74927Oooo0o0;
            if (textView2 == null) {
                OooOOO0.OooOOOO("pageSizeIndicator");
                throw null;
            }
            textView2.setText(iOooO0O03 + " x " + iOooO0O04);
            return;
        }
        OooOooO();
        oooOO02.getClass();
        Size sizeOooOO0o = o0oo000O.OooOO0.OooOO0o(page);
        Integer numValueOf = Integer.valueOf(sizeOooOO0o.getWidth());
        Integer numValueOf2 = Integer.valueOf(sizeOooOO0o.getHeight());
        int iIntValue3 = numValueOf.intValue() + iOooO0o3 + i3;
        int iIntValue4 = numValueOf2.intValue() + iOooO0o4 + i4;
        int iOooO0O05 = oO0O00O.OooO00o.OooO0O0(OooOooO().OooOOoo(iIntValue3));
        float fOooOOoo = OooOooO().OooOOoo(iIntValue4);
        TextView textView3 = this.f74927Oooo0o0;
        if (textView3 == null) {
            OooOOO0.OooOOOO("pageSizeIndicator");
            throw null;
        }
        textView3.setText(iOooO0O05 + " x " + fOooOOoo);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_page_padding, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = this.f74954o00oO0O;
        if (bitmap != null) {
            Oooo000(bitmap);
        }
        this.f74954o00oO0O = null;
        Bitmap bitmap2 = this.f74959o0ooOO0;
        if (bitmap2 != null) {
            Oooo000(bitmap2);
        }
        this.f74959o0ooOO0 = null;
        Bitmap bitmap3 = this.f74960o0ooOOo;
        if (bitmap3 != null) {
            Oooo000(bitmap3);
        }
        this.f74960o0ooOOo = null;
        o00000OO o00000oo2 = this.f74961o0ooOoO;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        this.f74961o0ooOoO = null;
        this.f74955o00oO0o = null;
        this.f74956o00ooo.set(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29423OooO00o c29423OooO00oOooOooO = OooOooO();
        String pageId = (String) this.f74915OooOoo.getValue();
        String noteId = (String) this.f74916OooOoo0.getValue();
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(noteId, "noteId");
        C33781o00o0O c33781o00o0O = c29423OooO00oOooOooO.f104366OooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, pageId);
        C33781o00o0O c33781o00o0O2 = c29423OooO00oOooOooO.f104360OooO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, noteId);
        View viewFindViewById = view.findViewById(R.id.btn_cancel);
        this.f74922Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28288OooO(this, 6));
        View viewFindViewById2 = view.findViewById(R.id.btn_confirm);
        this.f74918OooOooo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnSave");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC29133OooO0oO(this, 3));
        View viewFindViewById3 = view.findViewById(R.id.btn_restore);
        this.f74921Oooo000 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnRestore");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC26091OooO00o(this, 6));
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.page_padding_scroll);
        if (nestedScrollView != null) {
            ViewCompat.setNestedScrollingEnabled(nestedScrollView, true);
        }
        SingleSelectDropdownView singleSelectDropdownView = (SingleSelectDropdownView) view.findViewById(R.id.cl_page_spec);
        this.f74923Oooo00o = singleSelectDropdownView;
        if (singleSelectDropdownView == null) {
            OooOOO0.OooOOOO("clPaperSpec");
            throw null;
        }
        singleSelectDropdownView.setOnOptionSelectedListener(new C30827OooO0o(this, 0));
        this.f74920Oooo0 = (ViewGroup) view.findViewById(R.id.cl_editor);
        this.f74925Oooo0OO = view.findViewById(R.id.v_padding_indicator);
        this.f74927Oooo0o0 = (TextView) view.findViewById(R.id.tv_page_size_indicator);
        this.f74924Oooo0O0 = (ViewGroup) view.findViewById(R.id.cl_padding_editor);
        this.f74926Oooo0o = (ImageView) view.findViewById(R.id.iv_page_padding_style);
        this.f74928Oooo0oO = (ImageView) view.findViewById(R.id.iv_page_paper_theme);
        this.f74929Oooo0oo = (ImageView) view.findViewById(R.id.iv_page_paper_theme_tn_indicator);
        this.f74919Oooo = (ImageView) view.findViewById(R.id.iv_page_display_items);
        View viewFindViewById4 = view.findViewById(R.id.move_center);
        ViewOnTouchListenerC30822OooO viewOnTouchListenerC30822OooO = this.f74957o0OOO0o;
        viewFindViewById4.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById4);
        this.f74932OoooO00 = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.scale_left);
        viewFindViewById5.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById5);
        this.f74931OoooO0 = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.scale_right);
        viewFindViewById6.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById6);
        this.f74930OoooO = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.scale_top);
        viewFindViewById7.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById7);
        this.f74933OoooO0O = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.scale_bottom);
        viewFindViewById8.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById8);
        this.f74934OoooOO0 = viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.scale_bottom_left);
        viewFindViewById9.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById9);
        this.f74937OoooOo0 = viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.scale_top_left);
        viewFindViewById10.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById10);
        this.f74949o000oOoO = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.scale_bottom_right);
        viewFindViewById11.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById11);
        this.f74936OoooOOo = viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.scale_top_right);
        viewFindViewById12.setOnTouchListener(viewOnTouchListenerC30822OooO);
        C28025OooO0O0.OooO00o(viewFindViewById12);
        this.f74935OoooOOO = viewFindViewById12;
        TextView textView = (TextView) view.findViewById(R.id.tv_apply_all);
        if (textView == null) {
            OooOOO0.OooOOOO("tvApplyToAll");
            throw null;
        }
        textView.setEnabled(true);
        View viewFindViewById13 = view.findViewById(R.id.btn_apply_all);
        this.f74938OoooOoO = viewFindViewById13;
        if (viewFindViewById13 == null) {
            OooOOO0.OooOOOO("btnApplyToAll");
            throw null;
        }
        viewFindViewById13.setActivated(true);
        View view2 = this.f74938OoooOoO;
        if (view2 == null) {
            OooOOO0.OooOOOO("btnApplyToAll");
            throw null;
        }
        view2.setEnabled(true);
        View view3 = this.f74938OoooOoO;
        if (view3 == null) {
            OooOOO0.OooOOOO("btnApplyToAll");
            throw null;
        }
        C28050OooO0OO.OooO00o(view3, 500L, new ViewOnClickListenerC28540OooOoOO(this, 6));
        TextView textView2 = (TextView) view.findViewById(R.id.tv_apply_to_first);
        if (textView2 == null) {
            OooOOO0.OooOOOO("tvApplyToFirstPage");
            throw null;
        }
        textView2.setEnabled(true);
        View viewFindViewById14 = view.findViewById(R.id.btn_apply_to_first);
        this.f74939OoooOoo = viewFindViewById14;
        if (viewFindViewById14 == null) {
            OooOOO0.OooOOOO("btnApplyToFirstPage");
            throw null;
        }
        viewFindViewById14.setActivated(false);
        View view4 = this.f74939OoooOoo;
        if (view4 == null) {
            OooOOO0.OooOOOO("btnApplyToFirstPage");
            throw null;
        }
        view4.setEnabled(true);
        View view5 = this.f74939OoooOoo;
        if (view5 == null) {
            OooOOO0.OooOOOO("btnApplyToFirstPage");
            throw null;
        }
        C28050OooO0OO.OooO00o(view5, 500L, new ViewOnClickListenerC28542OooOoo0(this, 6));
        this.f74942OooooO0 = (RecyclerView) view.findViewById(R.id.rv_padding_pattern);
        C29409OooO0o0 c29409OooO0o0 = new C29409OooO0o0(C29409OooO0o0.f104287OooO0OO);
        c29409OooO0o0.f104288OooO0O0 = new C26370OooOOOO(this, 1);
        this.f74943OooooOO = c29409OooO0o0;
        RecyclerView recyclerView = this.f74942OooooO0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("paddingPatternRv");
            throw null;
        }
        recyclerView.setAdapter(c29409OooO0o0);
        this.f74944OooooOo = (RecyclerView) view.findViewById(R.id.rv_padding_layout);
        C29407OooO0Oo c29407OooO0Oo = new C29407OooO0Oo(C29407OooO0Oo.f104281OooO0OO);
        c29407OooO0Oo.f104282OooO0O0 = new C26371OooOOOo(this, 1);
        this.f74946Oooooo0 = c29407OooO0Oo;
        RecyclerView recyclerView2 = this.f74944OooooOo;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("paddingLayoutRv");
            throw null;
        }
        recyclerView2.setAdapter(c29407OooO0Oo);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        C29415OooO0o c29415OooO0o = new C29415OooO0o(contextRequireContext);
        this.f74941Ooooo0o = c29415OooO0o;
        c29415OooO0o.f104319OooOOO0 = new C30832OooOO0O(this);
        C29404OooO00o c29404OooO00o = new C29404OooO00o(C29404OooO00o.OooO0OO.f104277OooO00o);
        this.f74940Ooooo00 = c29404OooO00o;
        c29404OooO00o.f104273OooO0O0 = new C25080OooOO0o(this);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.rv_padding_color);
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("paddingColor");
            throw null;
        }
        C29404OooO00o c29404OooO00o2 = this.f74940Ooooo00;
        if (c29404OooO00o2 == null) {
            OooOOO0.OooOOOO("paddingColorAdapter");
            throw null;
        }
        recyclerView3.setAdapter(c29404OooO00o2);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30833OooOO0o(this, null), 3);
        this.f74945Oooooo = (TextView) view.findViewById(R.id.tv_item_space);
        this.f74947OoooooO = (SeekBar) view.findViewById(R.id.seekbar_style_item_space);
        this.f74948Ooooooo = (TextView) view.findViewById(R.id.tv_item_space_value);
        SeekBar seekBar = this.f74947OoooooO;
        if (seekBar == null) {
            OooOOO0.OooOOOO("itemSpaceSeekBar");
            throw null;
        }
        seekBar.setOnSeekBarChangeListener(new C30831OooOO0(this));
        Oooo0(false);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(null), 3);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new OooO00o());
        } else {
            InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new OooO0OO(null), 3);
        }
        view.requestLayout();
    }
}
