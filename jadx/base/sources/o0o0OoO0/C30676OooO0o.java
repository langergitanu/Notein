package o0o0OoO0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0o0O.C30176OooO0o0;
import o0o0O.C30177OooO0oO;
import o0o0OO0.C30394OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.view.AiOcrEditorListContainer$init$13", m80623f = "AiOcrEditorListContainer.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30676OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f109737OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f109738OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AiOcrEditorListContainer f109739OooOoO0;

    /* JADX INFO: renamed from: o0o0OoO0.OooO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.view.AiOcrEditorListContainer$init$13$1", m80623f = "AiOcrEditorListContainer.kt", m80624l = {StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30394OooOOOO f109740OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109741OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AiOcrEditorListContainer f109742OooOoO0;

        /* JADX INFO: renamed from: o0o0OoO0.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.view.AiOcrEditorListContainer$init$13$1$1", m80623f = "AiOcrEditorListContainer.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20120OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Map<Integer, ? extends Object>, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiOcrEditorListContainer f109743OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f109744OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20120OooO00o(AiOcrEditorListContainer aiOcrEditorListContainer, Continuation<? super C20120OooO00o> continuation) {
                super(2, continuation);
                this.f109743OooOo = aiOcrEditorListContainer;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20120OooO00o c20120OooO00o = new C20120OooO00o(this.f109743OooOo, continuation);
                c20120OooO00o.f109744OooOo0o = obj;
                return c20120OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Map<Integer, ? extends Object> map, Continuation<? super C32460OooOooO> continuation) {
                return ((C20120OooO00o) create(map, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                ImageView imageView;
                ImageView imageView2;
                ImageView imageView3;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Map<Integer, ? extends Object> map = (Map) this.f109744OooOo0o;
                int i = AiOcrEditorListContainer.f78420OoooOOO;
                AiOcrEditorListContainer aiOcrEditorListContainer = this.f109743OooOo;
                Context context = aiOcrEditorListContainer.getContext();
                if (context != null) {
                    for (Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        Object value = entry.getValue();
                        if (iIntValue == 0) {
                            View view = aiOcrEditorListContainer.f78429OooOooo;
                            if (view != null) {
                                OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Boolean");
                                view.setActivated(((Boolean) value).booleanValue());
                            }
                        } else if (iIntValue == 1) {
                            View view2 = aiOcrEditorListContainer.f78432Oooo000;
                            if (view2 != null) {
                                OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Boolean");
                                view2.setActivated(((Boolean) value).booleanValue());
                            }
                        } else if (iIntValue == 2) {
                            View view3 = aiOcrEditorListContainer.f78433Oooo00O;
                            if (view3 != null) {
                                OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Boolean");
                                view3.setActivated(((Boolean) value).booleanValue());
                            }
                        } else if (iIntValue != 7) {
                            if (iIntValue != 8) {
                                if (iIntValue != 9) {
                                    if (iIntValue == 12) {
                                        OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Int");
                                        int iIntValue2 = ((Integer) value).intValue();
                                        if (iIntValue2 == -16777216) {
                                            TextView textView = aiOcrEditorListContainer.f78438Oooo0o0;
                                            if (textView != null) {
                                                textView.setTextColor(context.getColor(R.color.edit_text_text_color_for_night_mode));
                                            }
                                        } else {
                                            TextView textView2 = aiOcrEditorListContainer.f78438Oooo0o0;
                                            if (textView2 != null) {
                                                textView2.setTextColor(iIntValue2);
                                            }
                                        }
                                    } else if (iIntValue == 14) {
                                        View view4 = aiOcrEditorListContainer.f78434Oooo00o;
                                        if (view4 != null) {
                                            OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Boolean");
                                            view4.setActivated(((Boolean) value).booleanValue());
                                        }
                                    } else if (iIntValue == 16) {
                                        OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.Int");
                                        int iIntValue3 = ((Integer) value).intValue();
                                        if (iIntValue3 == 0) {
                                            TextView textView3 = aiOcrEditorListContainer.f78438Oooo0o0;
                                            if (textView3 != null) {
                                                textView3.setBackgroundColor(0);
                                            }
                                        } else {
                                            TextView textView4 = aiOcrEditorListContainer.f78438Oooo0o0;
                                            if (textView4 != null) {
                                                textView4.setBackground(context.getDrawable(R.drawable.bg_text_color_indicator));
                                            }
                                            TextView textView5 = aiOcrEditorListContainer.f78438Oooo0o0;
                                            if (textView5 != null) {
                                                textView5.setBackgroundTintList(ColorStateList.valueOf(iIntValue3));
                                            }
                                        }
                                    }
                                } else if (OooOOO0.OooO0O0(value, Boolean.TRUE) && (imageView = aiOcrEditorListContainer.f78426OooOoo) != null) {
                                    imageView.setImageResource(R.drawable.ic_ni_transparent_textstyle_align_end_normal);
                                }
                            } else if (OooOOO0.OooO0O0(value, Boolean.TRUE) && (imageView2 = aiOcrEditorListContainer.f78426OooOoo) != null) {
                                imageView2.setImageResource(R.drawable.ic_ni_transparent_textstyle_align_center_normal);
                            }
                        } else if (OooOOO0.OooO0O0(value, Boolean.TRUE) && (imageView3 = aiOcrEditorListContainer.f78426OooOoo) != null) {
                            imageView3.setImageResource(R.drawable.ic_ni_transparent_textstyle_align_start_normal);
                        }
                    }
                    C30176OooO0o0 c30176OooO0o0 = aiOcrEditorListContainer.f78442OoooO0;
                    if (c30176OooO0o0 != null) {
                        c30176OooO0o0.OooO0OO(map);
                    }
                    o0o0O.OooO oooO = aiOcrEditorListContainer.f78443OoooO00;
                    if (oooO != null) {
                        oooO.OooO0Oo(map);
                    }
                    C30177OooO0oO c30177OooO0oO = aiOcrEditorListContainer.f78444OoooO0O;
                    if (c30177OooO0oO != null) {
                        c30177OooO0oO.OooO0OO(map);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30394OooOOOO c30394OooOOOO, AiOcrEditorListContainer aiOcrEditorListContainer, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109740OooOo = c30394OooOOOO;
            this.f109742OooOoO0 = aiOcrEditorListContainer;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109740OooOo, this.f109742OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109741OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30394OooOOOO c30394OooOOOO = this.f109740OooOo;
                C20120OooO00o c20120OooO00o = new C20120OooO00o(this.f109742OooOoO0, null);
                this.f109741OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c30394OooOOOO.f108520Oooo0, c20120OooO00o, this) == enumC32485OooO00o) {
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
    public C30676OooO0o(C30394OooOOOO c30394OooOOOO, AiOcrEditorListContainer aiOcrEditorListContainer, Continuation<? super C30676OooO0o> continuation) {
        super(2, continuation);
        this.f109737OooOo = c30394OooOOOO;
        this.f109739OooOoO0 = aiOcrEditorListContainer;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C30676OooO0o c30676OooO0o = new C30676OooO0o(this.f109737OooOo, this.f109739OooOoO0, continuation);
        c30676OooO0o.f109738OooOo0o = obj;
        return c30676OooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30676OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f109738OooOo0o, null, null, new OooO00o(this.f109737OooOo, this.f109739OooOoO0, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
