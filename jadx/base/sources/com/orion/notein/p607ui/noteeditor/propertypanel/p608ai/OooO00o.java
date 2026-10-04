package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.C22227OoooO;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import com.orion.notein.domain.models.p605ai.NoteAiContent;
import com.orion.notein.domain.models.p605ai.NoteSummary;
import com.orion.notein.global.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27287OooO0O0;
import o0OOo0Oo.InterfaceC27315OooOooo;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27597o00ooo00;
import o0Oooo.C29591OooO0O0;
import o0Oooo.C29592OooO0OO;
import o0Oooo.C29600OooOO0o;
import o0OoooO.AbstractC29615OooO0O0;
import o0OoooO.C29614OooO00o;
import o0OoooO.C29629OooOOo0;
import o0OoooOO.C29633OooO00o;
import o0oOoOo.C31050OooOo00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/ai/OooO00o;", "Landroidx/lifecycle/Ooooooo;", "OooO0OO", "OooO0O0", "OooO0Oo", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO00o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27597o00ooo00 f75591OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27287OooO0O0 f75592OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f75593OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27325OoooO00 f75594OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27315OooOooo f75595OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27449o00O0OoO f75596OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f75597OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicBoolean f75598OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33772OooooOo f75599OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public C29629OooOOo0 f75600OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33772OooooOo f75601OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f75602OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f75603OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f75604OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f75605OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f75606OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f75607OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f75608OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33781o00o0O f75609OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33769Ooooo0o f75610OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f75611OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33781o00o0O f75612OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33781o00o0O f75613OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00000OO f75614OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o00000OO f75615OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicBoolean f75616OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33772OooooOo f75617OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33772OooooOo f75618OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C32447OooOOo f75619Oooo000;

    public static final class OooO implements InterfaceC33721OooO0o<NoteMeta> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO00o f75620OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f75621OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO$OooO00o, reason: collision with other inner class name */
        public static final class C19350OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75622OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f75623OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$map$1$2", m80623f = "EditorAiViewModel.kt", m80624l = {51, 50}, m80625m = "emit")
            public static final class C19351OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f75624OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75625OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f75627OooOoO0;

                public C19351OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f75625OooOo0o = obj;
                    this.f75624OooOo |= Integer.MIN_VALUE;
                    return C19350OooO00o.this.emit(null, this);
                }
            }

            public C19350OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO00o oooO00o) {
                this.f75623OooOo0o = interfaceC33723OooO0oO;
                this.f75622OooOo = oooO00o;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
            
                if (r6.emit(r7, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19351OooO00o c19351OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                if (continuation instanceof C19351OooO00o) {
                    c19351OooO00o = (C19351OooO00o) continuation;
                    int i = c19351OooO00o.f75624OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19351OooO00o.f75624OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19351OooO00o = new C19351OooO00o(continuation);
                    }
                }
                Object objOooOoOO = c19351OooO00o.f75625OooOo0o;
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19351OooO00o.f75624OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(objOooOoOO);
                    C27449o00O0OoO c27449o00O0OoO = this.f75622OooOo.f75596OooO0oo;
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f75623OooOo0o;
                    c19351OooO00o.f75627OooOoO0 = interfaceC33723OooO0oO2;
                    c19351OooO00o.f75624OooOo = 1;
                    objOooOoOO = c27449o00O0OoO.OooOoOO((String) obj, c19351OooO00o);
                    if (objOooOoOO != obj2) {
                        interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOoOO);
                    return C32460OooOooO.f116667OooO00o;
                }
                InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = c19351OooO00o.f75627OooOoO0;
                C32446OooOOOo.OooO0O0(objOooOoOO);
                interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
                c19351OooO00o.f75627OooOoO0 = null;
                c19351OooO00o.f75624OooOo = 2;
            }
        }

        public OooO(C33781o00o0O c33781o00o0O, OooO00o oooO00o) {
            this.f75621OooOo0o = c33781o00o0O;
            this.f75620OooOo = oooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteMeta> interfaceC33723OooO0oO, Continuation continuation) {
            this.f75621OooOo0o.collect(new C19350OooO00o(interfaceC33723OooO0oO, this.f75620OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1", m80623f = "EditorAiViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19352OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75629OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$1", m80623f = "EditorAiViewModel.kt", m80624l = {167}, m80625m = "invokeSuspend")
        public static final class C19353OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75630OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75631OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$1$1", m80623f = "EditorAiViewModel.kt", m80624l = {168}, m80625m = "invokeSuspend")
            public static final class C19354OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ Object f75632OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f75633OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ OooO00o f75634OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19354OooO00o(OooO00o oooO00o, Continuation<? super C19354OooO00o> continuation) {
                    super(2, continuation);
                    this.f75634OooOoO0 = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19354OooO00o c19354OooO00o = new C19354OooO00o(this.f75634OooOoO0, continuation);
                    c19354OooO00o.f75632OooOo = obj;
                    return c19354OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19354OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f75633OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        String str = (String) this.f75632OooOo;
                        this.f75633OooOo0o = 1;
                        if (OooO00o.OooO(this.f75634OooOoO0, str, this) == enumC32485OooO00o) {
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
            public C19353OooO00o(OooO00o oooO00o, Continuation<? super C19353OooO00o> continuation) {
                super(2, continuation);
                this.f75630OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19353OooO00o(this.f75630OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19353OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75631OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO00o oooO00o = this.f75630OooOo;
                    C33769Ooooo0o c33769Ooooo0o = oooO00o.f75606OooOOoo;
                    C19354OooO00o c19354OooO00o = new C19354OooO00o(oooO00o, null);
                    this.f75631OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, c19354OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$2", m80623f = "EditorAiViewModel.kt", m80624l = {173}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75635OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75636OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$2$1", m80623f = "EditorAiViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19355OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {
                public C19355OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19355OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19355OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75635OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f75635OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75636OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33769Ooooo0o c33769Ooooo0o = this.f75635OooOo.f75604OooOOo;
                    C19355OooO00o c19355OooO00o = new C19355OooO00o(2, null);
                    this.f75636OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, c19355OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$3", m80623f = "EditorAiViewModel.kt", m80624l = {177}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75637OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75638OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$1$3$1", m80623f = "EditorAiViewModel.kt", m80624l = {182}, m80625m = "invokeSuspend")
            public static final class C19356OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ Object f75639OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f75640OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ OooO00o f75641OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19356OooO00o(OooO00o oooO00o, Continuation<? super C19356OooO00o> continuation) {
                    super(2, continuation);
                    this.f75641OooOoO0 = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19356OooO00o c19356OooO00o = new C19356OooO00o(this.f75641OooOoO0, continuation);
                    c19356OooO00o.f75639OooOo = obj;
                    return c19356OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Integer, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19356OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f75640OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75639OooOo;
                        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                        if (iIntValue <= 0 && iIntValue2 > 0) {
                            OooO00o oooO00o = this.f75641OooOoO0;
                            if (oooO00o.f75598OooOO0O.compareAndSet(true, false)) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("EditorChatViewModel");
                                c20358OooO00o.OooO0o0("quota is running out", new Object[0]);
                                C33772OooooOo c33772OooooOo = oooO00o.f75599OooOO0o;
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                this.f75640OooOo0o = 1;
                                if (c33772OooooOo.emit(c32460OooOooO, this) == enumC32485OooO00o) {
                                    return enumC32485OooO00o;
                                }
                            }
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
            public OooO0OO(OooO00o oooO00o, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f75637OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f75637OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75638OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    OooO00o oooO00o = this.f75637OooOo;
                    C33769Ooooo0o c33769Ooooo0o = oooO00o.f75603OooOOOo;
                    C19356OooO00o c19356OooO00o = new C19356OooO00o(oooO00o, null);
                    this.f75638OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, c19356OooO00o, this) == enumC32485OooO00o) {
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

        public C19352OooO00o(Continuation<? super C19352OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C19352OooO00o c19352OooO00o = OooO00o.this.new C19352OooO00o(continuation);
            c19352OooO00o.f75629OooOo0o = obj;
            return c19352OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19352OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75629OooOo0o;
            OooO00o oooO00o = OooO00o.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19353OooO00o(oooO00o, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(oooO00o, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(oooO00o, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C19357OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19357OooO00o f75642OooO00o = new C19357OooO00o();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C19358OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19358OooO0O0 f75643OooO00o = new C19358OooO0O0();
        }

        public static final class OooO0OO extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0OO f75644OooO00o = new OooO0OO();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        public static final class C23515OooO0Oo extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C23515OooO0Oo f75645OooO00o = new C23515OooO0Oo();
        }

        public static final class OooO0o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0o f75646OooO00o = new OooO0o();
        }

        public static final class OooO0o0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0o0 f75647OooO00o = new OooO0o0();
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
        public static final class C19359OooO00o extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19359OooO00o f75648OooO00o = new C19359OooO00o();
        }

        public static final class OooO0O0 extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0O0 f75649OooO00o = new OooO0O0();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public static final class C19360OooO0OO extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19360OooO0OO f75650OooO00o = new C19360OooO0OO();
        }

        public static final class OooO0Oo extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0Oo f75651OooO00o = new OooO0Oo();
        }

        public static final class OooO0o extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0o f75652OooO00o = new OooO0o();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0OO$OooO0o0, reason: case insensitive filesystem */
        public static final class C23516OooO0o0 extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C23516OooO0o0 f75653OooO00o = new C23516OooO0o0();
        }

        public final OooO0OO OooO00o(OooO0O0 event) {
            OooOOO0.OooO0oO(event, "event");
            C19359OooO00o c19359OooO00o = C19359OooO00o.f75648OooO00o;
            if (equals(c19359OooO00o)) {
                if (event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    return OooO0Oo.f75651OooO00o;
                }
                if (event.equals(OooO0O0.OooO0OO.f75644OooO00o)) {
                    return C19360OooO0OO.f75650OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("State");
                c20358OooO00o.OooO0OO("invalid event: " + event, new Object[0]);
                return null;
            }
            OooO0Oo oooO0Oo = OooO0Oo.f75651OooO00o;
            if (equals(oooO0Oo)) {
                if (!event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    if (event.equals(OooO0O0.OooO0OO.f75644OooO00o)) {
                        return C19360OooO0OO.f75650OooO00o;
                    }
                    if (event.equals(OooO0O0.C23515OooO0Oo.f75645OooO00o)) {
                        return OooO0o.f75652OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("State");
                    c20358OooO00o2.OooO0OO("invalid event: " + event, new Object[0]);
                    return null;
                }
            } else if (equals(C19360OooO0OO.f75650OooO00o)) {
                if (!event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("State");
                    c20358OooO00o3.OooO0OO("invalid event: " + event, new Object[0]);
                    return null;
                }
            } else if (equals(OooO0o.f75652OooO00o)) {
                if (event.equals(OooO0O0.OooO0o.f75646OooO00o)) {
                    return OooO0O0.f75649OooO00o;
                }
                if (event.equals(OooO0O0.OooO0o0.f75647OooO00o)) {
                    return C23516OooO0o0.f75653OooO00o;
                }
                if (!event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("State");
                    c20358OooO00o4.OooO0OO("invalid event: " + event, new Object[0]);
                    return null;
                }
            } else if (equals(C23516OooO0o0.f75653OooO00o)) {
                if (!event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("State");
                    c20358OooO00o5.OooO0OO("invalid event: " + event, new Object[0]);
                    return null;
                }
            } else {
                if (!equals(OooO0O0.f75649OooO00o)) {
                    throw new C32442OooOO0o();
                }
                if (!event.equals(OooO0O0.C19357OooO00o.f75642OooO00o)) {
                    if (event.equals(OooO0O0.C19358OooO0O0.f75643OooO00o)) {
                        return c19359OooO00o;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o6.OooOOO0("State");
                    c20358OooO00o6.OooO0OO("invalid event: " + event, new Object[0]);
                    return null;
                }
            }
            return oooO0Oo;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23517OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f75654OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f75655OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f75656OooO0OO;

        public C23517OooO0Oo(OooO0OO state, String str, String str2) {
            OooOOO0.OooO0oO(state, "state");
            this.f75654OooO00o = state;
            this.f75655OooO0O0 = str;
            this.f75656OooO0OO = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23517OooO0Oo)) {
                return false;
            }
            C23517OooO0Oo c23517OooO0Oo = (C23517OooO0Oo) obj;
            return OooOOO0.OooO0O0(this.f75654OooO00o, c23517OooO0Oo.f75654OooO00o) && OooOOO0.OooO0O0(this.f75655OooO0O0, c23517OooO0Oo.f75655OooO0O0) && OooOOO0.OooO0O0(this.f75656OooO0OO, c23517OooO0Oo.f75656OooO0OO);
        }

        public final int hashCode() {
            int iHashCode = this.f75654OooO00o.hashCode() * 31;
            String str = this.f75655OooO0O0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f75656OooO0OO;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatusMessage(state=");
            sb.append(this.f75654OooO00o);
            sb.append(", errorCode=");
            sb.append(this.f75655OooO0O0);
            sb.append(", errorMsg=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f75656OooO0OO, ")");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$flatMapLatest$1", m80623f = "EditorAiViewModel.kt", m80624l = {193, 189}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Integer>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f75657OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75658OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f75660OooOoO0;

        public OooO0o(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            OooO0o oooO0o = OooO00o.this.new OooO0o(continuation);
            oooO0o.f75657OooOo = interfaceC33723OooO0oO;
            oooO0o.f75660OooOoO0 = str;
            return oooO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r3, r5) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            return r0;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            Object c33716OooO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75658OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f75657OooOo;
                String str = (String) this.f75660OooOoO0;
                if (str == null) {
                    c33716OooO = new C33716OooO(new Integer(0));
                    this.f75657OooOo = null;
                    this.f75658OooOo0o = 2;
                } else {
                    InterfaceC27325OoooO00 interfaceC27325OoooO00 = OooO00o.this.f75594OooO0o0;
                    this.f75657OooOo = interfaceC33723OooO0oO;
                    this.f75658OooOo0o = 1;
                    obj = interfaceC27325OoooO00.OooO0Oo(str);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33723OooO0oO = this.f75657OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            c33716OooO = obj;
            this.f75657OooOo = null;
            this.f75658OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$aiQuotaUsage$1", m80623f = "EditorAiViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23518OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Integer, Continuation<? super C32443OooOOO<? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Integer f75661OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Integer f75662OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Integer num, Integer num2, Continuation<? super C32443OooOOO<? extends Integer, ? extends Integer>> continuation) {
            C23518OooO0o0 c23518OooO0o0 = new C23518OooO0o0(3, continuation);
            c23518OooO0o0.f75662OooOo0o = num;
            c23518OooO0o0.f75661OooOo = num2;
            return c23518OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Integer num = this.f75662OooOo0o;
            Integer num2 = this.f75661OooOo;
            return new C32443OooOOO(new Integer(num != null ? num.intValue() : 0), new Integer(num2 != null ? num2.intValue() : 0));
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$flatMapLatest$2", m80623f = "EditorAiViewModel.kt", m80624l = {193, 189}, m80625m = "invokeSuspend")
    public static final class C23519OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Integer>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f75663OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75664OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f75666OooOoO0;

        public C23519OooO0oO(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            C23519OooO0oO c23519OooO0oO = OooO00o.this.new C23519OooO0oO(continuation);
            c23519OooO0oO.f75663OooOo = interfaceC33723OooO0oO;
            c23519OooO0oO.f75666OooOoO0 = str;
            return c23519OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r3, r5) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            return r0;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            Object c33716OooO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75664OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = this.f75663OooOo;
                String str = (String) this.f75666OooOoO0;
                if (str == null) {
                    c33716OooO = new C33716OooO(new Integer(0));
                    this.f75663OooOo = null;
                    this.f75664OooOo0o = 2;
                } else {
                    InterfaceC27325OoooO00 interfaceC27325OoooO00 = OooO00o.this.f75594OooO0o0;
                    this.f75663OooOo = interfaceC33723OooO0oO;
                    this.f75664OooOo0o = 1;
                    obj = interfaceC27325OoooO00.OooO0o(str);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33723OooO0oO = this.f75663OooOo;
                C32446OooOOOo.OooO0O0(obj);
            }
            c33716OooO = obj;
            this.f75663OooOo = null;
            this.f75664OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$flatMapLatest$3", m80623f = "EditorAiViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class C23520OooO0oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteAiContent>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f75667OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75668OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f75670OooOoO0;

        public C23520OooO0oo(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super NoteAiContent> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            C23520OooO0oo c23520OooO0oo = OooO00o.this.new C23520OooO0oo(continuation);
            c23520OooO0oo.f75667OooOo = interfaceC33723OooO0oO;
            c23520OooO0oo.f75670OooOoO0 = str;
            return c23520OooO0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75668OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f75667OooOo;
                String str = (String) this.f75670OooOoO0;
                InterfaceC33721OooO0o<NoteAiContent> interfaceC33721OooO0oOooO0O0 = str != null ? OooO00o.this.f75592OooO0Oo.OooO0O0(str) : new C33716OooO(null);
                this.f75668OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO0O0, this) == enumC32485OooO00o) {
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

    public static final class OooOO0 implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO00o f75671OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f75672OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
        public static final class C19361OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75673OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f75674OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$map$2$2", m80623f = "EditorAiViewModel.kt", m80624l = {51, 50}, m80625m = "emit")
            public static final class C19362OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f75675OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75676OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f75678OooOoO0;

                public C19362OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f75676OooOo0o = obj;
                    this.f75675OooOo |= Integer.MIN_VALUE;
                    return C19361OooO00o.this.emit(null, this);
                }
            }

            public C19361OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO00o oooO00o) {
                this.f75674OooOo0o = interfaceC33723OooO0oO;
                this.f75673OooOo = oooO00o;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
            
                if (r6.emit(r7, r0) == r1) goto L30;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19362OooO00o c19362OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                String pdfPath;
                if (continuation instanceof C19362OooO00o) {
                    c19362OooO00o = (C19362OooO00o) continuation;
                    int i = c19362OooO00o.f75675OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19362OooO00o.f75675OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19362OooO00o = new C19362OooO00o(continuation);
                    }
                }
                Object objOooOoO0 = c19362OooO00o.f75676OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19362OooO00o.f75675OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    C27449o00O0OoO c27449o00O0OoO = this.f75673OooOo.f75596OooO0oo;
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f75674OooOo0o;
                    c19362OooO00o.f75678OooOoO0 = interfaceC33723OooO0oO2;
                    c19362OooO00o.f75675OooOo = 1;
                    objOooOoO0 = c27449o00O0OoO.OooOoO0((String) obj, c19362OooO00o);
                    if (objOooOoO0 != enumC32485OooO00o) {
                        interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOoO0);
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33723OooO0oO = c19362OooO00o.f75678OooOoO0;
                C32446OooOOOo.OooO0O0(objOooOoO0);
                NoteContent noteContent = (NoteContent) objOooOoO0;
                if (noteContent == null) {
                    pdfPath = null;
                } else {
                    PdfInfo pdfInfo = noteContent.getPdfInfo();
                    if (pdfInfo == null || (pdfPath = pdfInfo.getPdfPath()) == null) {
                        pdfPath = "";
                    }
                }
                c19362OooO00o.f75678OooOoO0 = null;
                c19362OooO00o.f75675OooOo = 2;
            }
        }

        public OooOO0(C33781o00o0O c33781o00o0O, OooO00o oooO00o) {
            this.f75672OooOo0o = c33781o00o0O;
            this.f75671OooOo = oooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            this.f75672OooOo0o.collect(new C19361OooO00o(interfaceC33723OooO0oO, this.f75671OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public static final class OooOO0O implements InterfaceC33721OooO0o<C31050OooOo00> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO00o f75679OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f75680OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
        public static final class C19363OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o f75681OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f75682OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.ai.OooO00o$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.ai.EditorAiViewModel$special$$inlined$map$3$2", m80623f = "EditorAiViewModel.kt", m80624l = {59, 50}, m80625m = "emit")
            public static final class C19364OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f75683OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75684OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public C19363OooO00o f75686OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public InterfaceC33723OooO0oO f75687OooOoOO;

                /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
                public Collection f75688OooOoo;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public NoteAiContent f75689OooOoo0;

                /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
                public Iterator f75690OooOooO;

                /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
                public Collection f75691OooOooo;

                public C19364OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f75684OooOo0o = obj;
                    this.f75683OooOo |= Integer.MIN_VALUE;
                    return C19363OooO00o.this.emit(null, this);
                }
            }

            public C19363OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO00o oooO00o) {
                this.f75682OooOo0o = interfaceC33723OooO0oO;
                this.f75681OooOo = oooO00o;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
            
                if (r13.emit(r12, r0) != r1) goto L37;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009d -> B:28:0x009e). Please report as a decompilation issue!!! */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19364OooO00o c19364OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                C31050OooOo00 c31050OooOo00;
                Collection arrayList;
                Iterator<T> it;
                C19363OooO00o<T> c19363OooO00o;
                NoteAiContent noteAiContent;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                if (continuation instanceof C19364OooO00o) {
                    c19364OooO00o = (C19364OooO00o) continuation;
                    int i = c19364OooO00o.f75683OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19364OooO00o.f75683OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19364OooO00o = new C19364OooO00o(continuation);
                    }
                }
                Object objOooO0o0 = c19364OooO00o.f75684OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19364OooO00o.f75683OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(objOooO0o0);
                    NoteAiContent noteAiContent2 = (NoteAiContent) obj;
                    interfaceC33723OooO0oO = this.f75682OooOo0o;
                    if (noteAiContent2 == null || noteAiContent2.getSummaryIdList().isEmpty()) {
                        c31050OooOo00 = null;
                        c19364OooO00o.f75686OooOoO0 = null;
                        c19364OooO00o.f75687OooOoOO = null;
                        c19364OooO00o.f75689OooOoo0 = null;
                        c19364OooO00o.f75688OooOoo = null;
                        c19364OooO00o.f75690OooOooO = null;
                        c19364OooO00o.f75691OooOooo = null;
                        c19364OooO00o.f75683OooOo = 2;
                    } else {
                        List<String> summaryIdList = noteAiContent2.getSummaryIdList();
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(summaryIdList, 10));
                        it = summaryIdList.iterator();
                        c19363OooO00o = this;
                        noteAiContent = noteAiContent2;
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        collection = arrayList;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooO0o0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    Collection collection = c19364OooO00o.f75691OooOooo;
                    it = c19364OooO00o.f75690OooOooO;
                    arrayList = c19364OooO00o.f75688OooOoo;
                    noteAiContent = c19364OooO00o.f75689OooOoo0;
                    interfaceC33723OooO0oO2 = c19364OooO00o.f75687OooOoOO;
                    c19363OooO00o = c19364OooO00o.f75686OooOoO0;
                    C32446OooOOOo.OooO0O0(objOooO0o0);
                    NoteSummary none = (NoteSummary) objOooO0o0;
                    if (none == null) {
                        none = NoteSummary.INSTANCE.getNONE();
                    }
                    collection.add(none);
                    collection = arrayList;
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        InterfaceC27287OooO0O0 interfaceC27287OooO0O0 = c19363OooO00o.f75681OooOo.f75592OooO0Oo;
                        c19364OooO00o.f75686OooOoO0 = c19363OooO00o;
                        c19364OooO00o.f75687OooOoOO = interfaceC33723OooO0oO2;
                        c19364OooO00o.f75689OooOoo0 = noteAiContent;
                        Collection collection2 = collection;
                        c19364OooO00o.f75688OooOoo = collection2;
                        c19364OooO00o.f75690OooOooO = it;
                        c19364OooO00o.f75691OooOooo = collection2;
                        c19364OooO00o.f75683OooOo = 1;
                        objOooO0o0 = interfaceC27287OooO0O0.OooO0o0(str, c19364OooO00o);
                        if (objOooO0o0 != enumC32485OooO00o) {
                            arrayList = collection;
                            NoteSummary none2 = (NoteSummary) objOooO0o0;
                            if (none2 == null) {
                            }
                            collection.add(none2);
                            collection = arrayList;
                            if (it.hasNext()) {
                                c31050OooOo00 = new C31050OooOo00(noteAiContent.getSavedSummaryIndex(), noteAiContent.getId(), (List) collection);
                                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                                c19364OooO00o.f75686OooOoO0 = null;
                                c19364OooO00o.f75687OooOoOO = null;
                                c19364OooO00o.f75689OooOoo0 = null;
                                c19364OooO00o.f75688OooOoo = null;
                                c19364OooO00o.f75690OooOooO = null;
                                c19364OooO00o.f75691OooOooo = null;
                                c19364OooO00o.f75683OooOo = 2;
                            }
                        }
                        return enumC32485OooO00o;
                    }
                }
            }
        }

        public OooOO0O(C33769Ooooo0o c33769Ooooo0o, OooO00o oooO00o) {
            this.f75680OooOo0o = c33769Ooooo0o;
            this.f75679OooOo = oooO00o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super C31050OooOo00> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f75680OooOo0o.f121747OooOo0o.collect(new C19363OooO00o(interfaceC33723OooO0oO, this.f75679OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO00o(InterfaceC27287OooO0O0 aiAssistantRepo, InterfaceC27325OoooO00 vertexAiRepo, InterfaceC27322Oooo0o0 remoteConfigRepo, InterfaceC27315OooOooo firebaseUserRepo, C27449o00O0OoO c27449o00O0OoO, C27597o00ooo00 vipFeatureUseCase, Context context) {
        OooOOO0.OooO0oO(aiAssistantRepo, "aiAssistantRepo");
        OooOOO0.OooO0oO(vertexAiRepo, "vertexAiRepo");
        OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        OooOOO0.OooO0oO(firebaseUserRepo, "firebaseUserRepo");
        OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        this.f75592OooO0Oo = aiAssistantRepo;
        this.f75594OooO0o0 = vertexAiRepo;
        this.f75593OooO0o = remoteConfigRepo;
        this.f75595OooO0oO = firebaseUserRepo;
        this.f75596OooO0oo = c27449o00O0OoO;
        this.f75591OooO = vipFeatureUseCase;
        this.f75597OooOO0 = context;
        this.f75598OooOO0O = new AtomicBoolean(false);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f75599OooOO0o = c33772OooooOoOooO0O0;
        this.f75601OooOOO0 = c33772OooooOoOooO0O0;
        this.f75602OooOOOO = new Object();
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(firebaseUserRepo.getUid(), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f75603OooOOOo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new OooO0o(null)), C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C23519OooO0oO(null)), new C23518OooO0o0(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new C32443OooOOO(0, 0));
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f75605OooOOo0 = c33781o00o0OOooO00o;
        OooO oooO = new OooO(c33781o00o0OOooO00o, this);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f75604OooOOo = C25252OooO0Oo.OooOoO0(oooO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(3), null);
        this.f75606OooOOoo = C25252OooO0Oo.OooOoO0(new OooOO0(c33781o00o0OOooO00o, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(3), null);
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(null);
        this.f75609OooOo00 = c33781o00o0OOooO00o2;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o2, new C23520OooO0oo(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(3), null);
        this.f75608OooOo0 = c33769Ooooo0oOooOoO02;
        this.f75610OooOo0O = C25252OooO0Oo.OooOoO0(new OooOO0O(c33769Ooooo0oOooOoO02, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(3), null);
        OooO0OO.C19359OooO00o c19359OooO00o = OooO0OO.C19359OooO00o.f75648OooO00o;
        this.f75611OooOo0o = C33784o00ooo.OooO00o(c19359OooO00o);
        this.f75607OooOo = C33784o00ooo.OooO00o(C34434OooOoO.f123453OooOo0o);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(new C23517OooO0Oo(c19359OooO00o, null, null));
        this.f75613OooOoO0 = c33781o00o0OOooO00o3;
        this.f75612OooOoO = c33781o00o0OOooO00o3;
        this.f75616OooOoo0 = new AtomicBoolean(false);
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f75617OooOooO = c33772OooooOoOooO0O02;
        this.f75618OooOooo = c33772OooooOoOooO0O02;
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C19352OooO00o(null), 3);
        this.f75619Oooo000 = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Oooo.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f104926OooOo0o.f75591OooO.OooO0Oo();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO(OooO00o oooO00o, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29600OooOO0o c29600OooOO0o;
        File pdfFile;
        OooO00o oooO00o2;
        String aiAssistantModelName;
        String aiAssistantModelLocation;
        oooO00o.getClass();
        if (abstractC32479OooO0OO instanceof C29600OooOO0o) {
            c29600OooOO0o = (C29600OooOO0o) abstractC32479OooO0OO;
            int i = c29600OooOO0o.f104972OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29600OooOO0o.f104972OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c29600OooOO0o = new C29600OooOO0o(oooO00o, abstractC32479OooO0OO);
            }
        }
        Object obj = c29600OooOO0o.f104969OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29600OooOO0o.f104972OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000OO o00000oo2 = oooO00o.f75614OooOoOO;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            o00000OO o00000oo3 = oooO00o.f75615OooOoo;
            if (o00000oo3 != null) {
                o00000oo3.cancel((CancellationException) null);
            }
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (str.length() == 0) {
                oooO00o.OooOOO(OooO0O0.OooO0OO.f75644OooO00o, "400002");
                return C32460OooOooO.f116667OooO00o;
            }
            File file = new File(str);
            if (!file.exists()) {
                oooO00o.OooOOO(OooO0O0.OooO0OO.f75644OooO00o, "400003");
                return C32460OooOooO.f116667OooO00o;
            }
            c29600OooOO0o.f104968OooOo0o = oooO00o;
            c29600OooOO0o.f104967OooOo = file;
            c29600OooOO0o.f104970OooOoO0 = oooO00o;
            c29600OooOO0o.f104972OooOoo0 = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29592OooO0OO(file, oooO00o, oooO00o.f75597OooOO0, null), c29600OooOO0o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            obj = objOooO0o;
            pdfFile = file;
            oooO00o2 = oooO00o;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO00o = c29600OooOO0o.f104970OooOoO0;
            pdfFile = c29600OooOO0o.f104967OooOo;
            oooO00o2 = c29600OooOO0o.f104968OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("EditorChatViewModel");
            c20358OooO00o.OooO0OO("startChain: invalid PDF file", new Object[0]);
            oooO00o2.OooOOO(OooO0O0.OooO0OO.f75644OooO00o, "400004");
            return C32460OooOooO.f116667OooO00o;
        }
        AiFeatureConfig aiFeatureConfigOooOO0O = oooO00o2.OooOO0O();
        if (aiFeatureConfigOooOO0O == null || (aiAssistantModelName = aiFeatureConfigOooOO0O.getAiAssistantModelName()) == null) {
            aiAssistantModelName = AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_NAME;
        } else {
            if (C33599OooOo0O.Oooo0o0(aiAssistantModelName)) {
                aiAssistantModelName = null;
            }
            if (aiAssistantModelName == null) {
            }
        }
        AiFeatureConfig aiFeatureConfigOooOO0O2 = oooO00o2.OooOO0O();
        if (aiFeatureConfigOooOO0O2 == null || (aiAssistantModelLocation = aiFeatureConfigOooOO0O2.getAiAssistantModelLocation()) == null) {
            aiAssistantModelLocation = AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_LOCATION;
        } else {
            if (C33599OooOo0O.Oooo0o0(aiAssistantModelLocation)) {
                aiAssistantModelLocation = null;
            }
            if (aiAssistantModelLocation == null) {
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o2, "EditorChatViewModel", "startChain: create Gemini assistant with model: ", aiAssistantModelName, ", location: ");
        sbOooO00o.append(aiAssistantModelLocation);
        c20358OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
        AbstractC29615OooO0O0.OooO00o[] oooO00oArr = AbstractC29615OooO0O0.OooO00o.f104993OooOo0o;
        Context context = oooO00o2.f75597OooOO0;
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(pdfFile, "pdfFile");
        if (C29614OooO00o.f104991OooO00o[0] != 1) {
            throw new C32442OooOO0o();
        }
        oooO00o.f75600OooOOO = new C29629OooOOo0(context, aiAssistantModelName, pdfFile, aiAssistantModelLocation);
        oooO00o2.OooOOO(OooO0O0.C19357OooO00o.f75642OooO00o, null);
        return C32460OooOooO.f116667OooO00o;
    }

    public static final boolean OooO0o(OooO00o oooO00o) {
        AiFeatureConfig aiFeatureConfigOooOO0O = oooO00o.OooOO0O();
        Integer numValueOf = aiFeatureConfigOooOO0O != null ? Integer.valueOf(aiFeatureConfigOooOO0O.getAppMinVersion()) : null;
        if (numValueOf != null) {
            return 394 >= numValueOf.intValue();
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("EditorChatViewModel");
        c20358OooO00o.OooO0OO("minAppVersion is null", new Object[0]);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(OooO00o oooO00o, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29591OooO0O0 c29591OooO0O0;
        String str2;
        OooO00o oooO00o2 = oooO00o;
        if (abstractC32479OooO0OO instanceof C29591OooO0O0) {
            c29591OooO0O0 = (C29591OooO0O0) abstractC32479OooO0OO;
            int i = c29591OooO0O0.f104931OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29591OooO0O0.f104931OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29591OooO0O0 = new C29591OooO0O0(oooO00o2, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c29591OooO0O0.f104930OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29591OooO0O0.f104931OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c29591OooO0O0.f104928OooOo0o = oooO00o2;
            c29591OooO0O0.f104927OooOo = str;
            c29591OooO0O0.f104931OooOoOO = 1;
            objOooO00o = oooO00o2.f75592OooO0Oo.OooO00o(str, c29591OooO0O0);
            if (objOooO00o != enumC32485OooO00o) {
                str2 = str;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NoteAiContent noteAiContent = (NoteAiContent) c29591OooO0O0.f104928OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            return noteAiContent;
        }
        String str3 = c29591OooO0O0.f104927OooOo;
        OooO00o oooO00o3 = (OooO00o) c29591OooO0O0.f104928OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        str2 = str3;
        oooO00o2 = oooO00o3;
        NoteAiContent noteAiContent2 = (NoteAiContent) objOooO00o;
        if (noteAiContent2 != null) {
            return noteAiContent2;
        }
        NoteAiContent noteAiContent3 = new NoteAiContent(str2, C34434OooOoO.f123453OooOo0o, 0, System.currentTimeMillis(), System.currentTimeMillis(), 4, null);
        InterfaceC27287OooO0O0 interfaceC27287OooO0O0 = oooO00o2.f75592OooO0Oo;
        c29591OooO0O0.f104928OooOo0o = noteAiContent3;
        c29591OooO0O0.f104927OooOo = null;
        c29591OooO0O0.f104931OooOoOO = 2;
        return interfaceC27287OooO0O0.OooO0o(noteAiContent3, c29591OooO0O0) == enumC32485OooO00o ? enumC32485OooO00o : noteAiContent3;
    }

    public static final void OooO0oO(OooO00o oooO00o, String str, String str2) {
        C33781o00o0O c33781o00o0O = oooO00o.f75607OooOo;
        List list = (List) c33781o00o0O.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            C29633OooO00o c29633OooO00o = (C29633OooO00o) obj;
            arrayList.add(OooOOO0.OooO0O0(c29633OooO00o.f105071OooO00o, str) ? C29633OooO00o.OooO00o(c29633OooO00o, str2, 29) : C29633OooO00o.OooO00o(c29633OooO00o, null, 31));
            i = i2;
        }
        c33781o00o0O.OooOO0(null, arrayList);
    }

    public static final void OooO0oo(OooO00o oooO00o, String str) {
        synchronized (oooO00o.f75602OooOOOO) {
            oooO00o.f75609OooOo00.setValue(str);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public final void OooOO0() {
        List listOooO0oO = OooOo.OooO0oO(new C29633OooO00o("0", "Hello! I can answer questions related to the document you uploaded. Feel free to ask questions related to your document. Thank you!", false, System.currentTimeMillis(), R.string.ai_chat_welcome_message));
        C33781o00o0O c33781o00o0O = this.f75607OooOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, listOooO0oO);
    }

    public final AiFeatureConfig OooOO0O() {
        return (AiFeatureConfig) this.f75619Oooo000.getValue();
    }

    public final void OooOO0o(String noteId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        if (this.f75616OooOoo0.get()) {
            C33781o00o0O c33781o00o0O = this.f75605OooOOo0;
            boolean zOooO0O0 = OooOOO0.OooO0O0(c33781o00o0O.getValue(), noteId);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "EditorChatViewModel", "setNoteId: ", noteId, ", changed: ");
            sbOooO00o.append(!zOooO0O0);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            if (zOooO0O0) {
                return;
            }
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, noteId);
            OooOO0();
        }
    }

    public final void OooOOO(OooO0O0 oooO0O0, String str) {
        synchronized (this.f75602OooOOOO) {
            OooO0OO oooO0OO = (OooO0OO) this.f75611OooOo0o.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("EditorChatViewModel");
            c20358OooO00o.OooO0o0("transitionToState currentState: " + oooO0OO.getClass().getSimpleName() + ", event: " + oooO0O0.getClass().getSimpleName(), new Object[0]);
            OooO0OO oooO0OOOooO00o = oooO0OO.OooO00o(oooO0O0);
            if (oooO0OOOooO00o != null) {
                OooOOO0(oooO0OOOooO00o, str);
            } else {
                c20358OooO00o.OooOOO0("EditorChatViewModel");
                c20358OooO00o.OooO0OO("Can not change the state. current: " + oooO0OO + " event: " + oooO0O0, new Object[0]);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public final void OooOOO0(OooO0OO oooO0OO, String str) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("EditorChatViewModel");
        c20358OooO00o.OooO0o0("setStateLocked newState: ".concat(oooO0OO.getClass().getSimpleName()), new Object[0]);
        C33781o00o0O c33781o00o0O = this.f75611OooOo0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO0OO);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO0O0(oooO0OO, this, str, null), 2);
    }
}
