package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import android.content.Context;
import android.graphics.RectF;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0o00.C25911OooO0OO;
import o0O0o00.o00000OO;
import o0Ooo0O.C29375OooO00o;
import o0Ooo0O0.OooOo;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1", m80623f = "PageLayerEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f74752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f74753OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ PageLayerEditor f74754OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$1", m80623f = "PageLayerEditor.kt", m80624l = {81}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f74755OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74756OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PageLayerEditor f74757OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$1$1", m80623f = "PageLayerEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19305OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C30837OooO00o>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f74758OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f74759OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PageLayerEditor f74760OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19305OooO00o(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditor pageLayerEditor, Continuation<? super C19305OooO00o> continuation) {
                super(2, continuation);
                this.f74758OooOo = oooO0OO;
                this.f74760OooOoO0 = pageLayerEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19305OooO00o c19305OooO00o = new C19305OooO00o(this.f74758OooOo, this.f74760OooOoO0, continuation);
                c19305OooO00o.f74759OooOo0o = obj;
                return c19305OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends C30837OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19305OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                String str;
                Object next;
                Object next2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                final List list = (List) this.f74759OooOo0o;
                List<C30837OooO00o> list2 = list;
                boolean z = list2 instanceof Collection;
                final PageLayerEditor pageLayerEditor = this.f74760OooOoO0;
                if (!z || !list2.isEmpty()) {
                    for (C30837OooO00o c30837OooO00o : list2) {
                        if (!OooOOO0.OooO0O0(c30837OooO00o.f110196OooO00o, "default") && ((str = c30837OooO00o.f110201OooO0o0) == null || str.length() == 0)) {
                            Context context = pageLayerEditor.getContext();
                            OooOOO0.OooO0o(context, "getContext(...)");
                            com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f74758OooOo;
                            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OO), oooO0OO.f74775OooO0oO, null, new OooOo(oooO0OO, context, null), 2);
                            break;
                        }
                    }
                }
                C29375OooO00o c29375OooO00o = pageLayerEditor.f74868OooOoO;
                if (c29375OooO00o == null) {
                    OooOOO0.OooOOOO("adapter");
                    throw null;
                }
                Iterable iterable = c29375OooO00o.f66021OooO00o.f65811OooO0o;
                OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C30837OooO00o) next).f110195OooO) {
                        break;
                    }
                }
                final C30837OooO00o c30837OooO00o2 = (C30837OooO00o) next;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((C30837OooO00o) next2).f110195OooO) {
                        break;
                    }
                }
                final C30837OooO00o c30837OooO00o3 = (C30837OooO00o) next2;
                C29375OooO00o c29375OooO00o2 = pageLayerEditor.f74868OooOoO;
                if (c29375OooO00o2 != null) {
                    c29375OooO00o2.OooO0o0(list, new Runnable() { // from class: o0Ooo0O0.OooOO0o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C30837OooO00o c30837OooO00o4 = c30837OooO00o2;
                            String str2 = c30837OooO00o4 != null ? c30837OooO00o4.f110196OooO00o : null;
                            C30837OooO00o c30837OooO00o5 = c30837OooO00o3;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str2, c30837OooO00o5 != null ? c30837OooO00o5.f110196OooO00o : null)) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c30837OooO00o4 != null ? Integer.valueOf(c30837OooO00o4.f110199OooO0Oo) : null, c30837OooO00o5 != null ? Integer.valueOf(c30837OooO00o5.f110199OooO0Oo) : null)) {
                                    return;
                                }
                            }
                            Iterator it3 = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i = -1;
                                    break;
                                } else {
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C30837OooO00o) it3.next()).f110196OooO00o, c30837OooO00o5 != null ? c30837OooO00o5.f110196OooO00o : null)) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            if (i == -1) {
                                return;
                            }
                            PageLayerEditor pageLayerEditor2 = pageLayerEditor;
                            RecyclerView recyclerView = pageLayerEditor2.f74869OooOoO0;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("recyclerView");
                                throw null;
                            }
                            RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                            if (i < iFindFirstCompletelyVisibleItemPosition || i > iFindLastCompletelyVisibleItemPosition || i == 0 || i == r1.size() - 1) {
                                RecyclerView recyclerView2 = pageLayerEditor2.f74869OooOoO0;
                                if (recyclerView2 != null) {
                                    recyclerView2.scrollToPosition(i);
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("recyclerView");
                                    throw null;
                                }
                            }
                        }
                    });
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("adapter");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditor pageLayerEditor, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f74755OooOo = oooO0OO;
            this.f74757OooOoO0 = pageLayerEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f74755OooOo, this.f74757OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74756OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f74755OooOo;
                C19305OooO00o c19305OooO00o = new C19305OooO00o(oooO0OO, this.f74757OooOoO0, null);
                this.f74756OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f74787OooOo00, c19305OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$2", m80623f = "PageLayerEditor.kt", m80624l = {117}, m80625m = "invokeSuspend")
    public static final class C19306OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f74761OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74762OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PageLayerEditor f74763OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0O0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$2$1", m80623f = "PageLayerEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.C19307OooO0OO, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageLayerEditor f74764OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f74765OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PageLayerEditor pageLayerEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f74764OooOo = pageLayerEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f74764OooOo, continuation);
                oooO00o.f74765OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0OO.C19307OooO0OO c19307OooO0OO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c19307OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                AbstractC22830OooO0Oo abstractC22830OooO0Oo;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO.C19307OooO0OO c19307OooO0OO = (OooO0OO.C19307OooO0OO) this.f74765OooOo0o;
                PDFView pDFView = this.f74764OooOo.f74871OooOoo;
                if (pDFView == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                pDFView.setPageLayers(c19307OooO0OO.f74803OooO00o);
                int iOrdinal = c19307OooO0OO.f74804OooO0O0.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && (abstractC22830OooO0Oo = pDFView.f69170OooOooO) != null) {
                        abstractC22830OooO0Oo.OooOoo0();
                    }
                } else if (pDFView.f69170OooOooO != null) {
                    RectF rectF = new RectF();
                    C25911OooO0OO c25911OooO0OO = pDFView.f69165OooOoO;
                    Iterator it = c25911OooO0OO.OooO().iterator();
                    while (it.hasNext()) {
                        pDFView.f69180Oooo0o0.OooO00o(new o00000OO((PagePart) it.next(), rectF, true, false));
                    }
                    Iterator it2 = c25911OooO0OO.OooO0oo().iterator();
                    while (it2.hasNext()) {
                        pDFView.f69180Oooo0o0.OooO00o(new o00000OO((PagePart) it2.next(), rectF, true, false));
                    }
                    pDFView.invalidate();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19306OooO0O0(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditor pageLayerEditor, Continuation<? super C19306OooO0O0> continuation) {
            super(2, continuation);
            this.f74761OooOo = oooO0OO;
            this.f74763OooOoO0 = pageLayerEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19306OooO0O0(this.f74761OooOo, this.f74763OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19306OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74762OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f74761OooOo.f74771OooO;
                OooO00o oooO00o = new OooO00o(this.f74763OooOoO0, null);
                this.f74762OooOo0o = 1;
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$3", m80623f = "PageLayerEditor.kt", m80624l = {136}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO f74766OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74767OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PageLayerEditor f74768OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor$initByViewModel$1$3$1", m80623f = "PageLayerEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PageLayerEditor f74769OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f74770OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PageLayerEditor pageLayerEditor, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f74769OooOo = pageLayerEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f74769OooOo, continuation);
                oooO00o.f74770OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0OO.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) this.f74770OooOo0o;
                boolean z = oooO0O0.f74802OooO0OO;
                PageLayerEditor pageLayerEditor = this.f74769OooOo;
                int i = oooO0O0.f74800OooO00o;
                PageLayer pageLayer = oooO0O0.f74801OooO0O0;
                if (z) {
                    PageLayerEditor.OooO00o eventListener = pageLayerEditor.getEventListener();
                    if (eventListener != null) {
                        eventListener.OooO0o0(pageLayer, i);
                    }
                } else {
                    PageLayerEditor.OooO00o eventListener2 = pageLayerEditor.getEventListener();
                    if (eventListener2 != null) {
                        eventListener2.OooO0oO(pageLayer, i);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditor pageLayerEditor, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f74766OooOo = oooO0OO;
            this.f74768OooOoO0 = pageLayerEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f74766OooOo, this.f74768OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74767OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = this.f74766OooOo.f74778OooOO0O;
                OooO00o oooO00o = new OooO00o(this.f74768OooOoO0, null);
                this.f74767OooOo0o = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO, PageLayerEditor pageLayerEditor, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f74752OooOo = oooO0OO;
        this.f74754OooOoO0 = pageLayerEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f74752OooOo, this.f74754OooOoO0, continuation);
        oooO0O0.f74753OooOo0o = obj;
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
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f74753OooOo0o;
        com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = this.f74752OooOo;
        PageLayerEditor pageLayerEditor = this.f74754OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(oooO0OO, pageLayerEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19306OooO0O0(oooO0OO, pageLayerEditor, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(oooO0OO, pageLayerEditor, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
