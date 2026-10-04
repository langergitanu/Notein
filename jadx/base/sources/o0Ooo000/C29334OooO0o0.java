package o0Ooo000;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OoOooO.C29251OooO00o;
import o0Ooo00.C29327OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$initTiledPageList$4", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29334OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ HyperlinkTiledPagesFragment f104052OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104053OooOo0o;

    /* JADX INFO: renamed from: o0Ooo000.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$initTiledPageList$4$1", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {153}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ HyperlinkTiledPagesFragment f104054OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104055OooOo0o;

        /* JADX INFO: renamed from: o0Ooo000.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$initTiledPageList$4$1$1", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19984OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends TiledPagePreviewVO>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ HyperlinkTiledPagesFragment f104056OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f104057OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19984OooO00o(HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment, Continuation<? super C19984OooO00o> continuation) {
                super(2, continuation);
                this.f104056OooOo = hyperlinkTiledPagesFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19984OooO00o c19984OooO00o = new C19984OooO00o(this.f104056OooOo, continuation);
                c19984OooO00o.f104057OooOo0o = obj;
                return c19984OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(List<? extends TiledPagePreviewVO> list, Continuation<? super C32460OooOooO> continuation) {
                return ((C19984OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                final List list = (List) this.f104057OooOo0o;
                if (list != null) {
                    final HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = this.f104056OooOo;
                    C29251OooO00o c29251OooO00o = hyperlinkTiledPagesFragment.f74639Oooo00o;
                    if (c29251OooO00o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageAdapter");
                        throw null;
                    }
                    final int itemCount = c29251OooO00o.getItemCount();
                    RecyclerView recyclerView = hyperlinkTiledPagesFragment.f74638Oooo00O;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                        throw null;
                    }
                    RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    final int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                    C29251OooO00o c29251OooO00o2 = hyperlinkTiledPagesFragment.f74639Oooo00o;
                    if (c29251OooO00o2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageAdapter");
                        throw null;
                    }
                    c29251OooO00o2.OooO0o0(list, new Runnable() { // from class: o0Ooo000.OooO0OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            int iFindFirstVisibleItemPosition2 = gridLayoutManager.findFirstVisibleItemPosition();
                            HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment2 = hyperlinkTiledPagesFragment;
                            if (itemCount > 1 || list.isEmpty()) {
                                int i = iFindFirstVisibleItemPosition;
                                if (i != iFindFirstVisibleItemPosition2) {
                                    RecyclerView recyclerView2 = hyperlinkTiledPagesFragment2.f74638Oooo00O;
                                    if (recyclerView2 != null) {
                                        recyclerView2.scrollToPosition(i);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            hyperlinkTiledPagesFragment2.OooOoo0();
                            hyperlinkTiledPagesFragment2.OooOoo0();
                            hyperlinkTiledPagesFragment2.OooOoo0();
                            RecyclerView recyclerView3 = hyperlinkTiledPagesFragment2.f74638Oooo00O;
                            if (recyclerView3 != null) {
                                recyclerView3.scrollToPosition(0);
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tiledPageList");
                                throw null;
                            }
                        }
                    });
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104054OooOo = hyperlinkTiledPagesFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f104054OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104055OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = this.f104054OooOo;
                C29327OooO0Oo c29327OooO0OoOooOoo0 = hyperlinkTiledPagesFragment.OooOoo0();
                C19984OooO00o c19984OooO00o = new C19984OooO00o(hyperlinkTiledPagesFragment, null);
                this.f104055OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c29327OooO0OoOooOoo0.f104024OooOO0, c19984OooO00o, this) == enumC32485OooO00o) {
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
    public C29334OooO0o0(HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment, Continuation<? super C29334OooO0o0> continuation) {
        super(2, continuation);
        this.f104052OooOo = hyperlinkTiledPagesFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29334OooO0o0 c29334OooO0o0 = new C29334OooO0o0(this.f104052OooOo, continuation);
        c29334OooO0o0.f104053OooOo0o = obj;
        return c29334OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29334OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f104053OooOo0o, null, null, new OooO00o(this.f104052OooOo, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
