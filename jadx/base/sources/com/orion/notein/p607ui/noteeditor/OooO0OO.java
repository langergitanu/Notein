package com.orion.notein.p607ui.noteeditor;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.C22194OoooOOo;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.App;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import o000OoO.C24536OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26486OooOo0o;
import o0OO00o0.C26531o0000Ooo;
import o0OO00o0.C26537o0000oO0;
import o0OO00o0.C26541o0000oo0;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.C26687o0OoO0o;
import o0OO00o0.o0000;
import o0OO00o0.o00000;
import o0OO00o0.o00000OO;
import o0OO00o0.oo0o0Oo;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO.C27078OooO0o0;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27295OooOO0O;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27328OooO0OO;
import o0OOo0o.C27428o000oOoO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.o00000O;
import o0OOoO.C27710OooO0oo;
import o0OOoOo.C27784OooO00o;
import o0OOoOo.C27786OooO0OO;
import o0OOoo.C27821OooO;
import o0OOoo0o.C27862OooO0o;
import o0OOoo0o.C27864OooO0oO;
import o0OOoo0o.C27869OooOOO;
import o0OOooo0.C27994OooOOOO;
import o0Oo00oO.C28038OooO0Oo;
import o0OoO0oo.C28791o000OOO;
import o0OoO0oo.C28794o000Oo;
import o0OoO0oo.C28797o000Oo0O;
import o0OoO0oo.C28798o000Oo0o;
import o0OoO0oo.C28806o000o00;
import o0OoO0oo.C28807o000o000;
import o0OoO0oo.C28808o000o00O;
import o0OoO0oo.C28809o000o00o;
import o0OoO0oo.C28812o000o0OO;
import o0OoO0oo.C28813o000o0Oo;
import o0OoO0oo.C28814o000o0o;
import o0OoO0oo.C28815o000o0o0;
import o0OoO0oo.C28816o000o0oO;
import o0OoO0oo.C28817o000o0oo;
import o0OoO0oo.C28819o000oOoo;
import o0OoO0oo.C28821o000oo0;
import o0OoO0oo.C28823o000oo0O;
import o0OoO0oo.C28824o000oo0o;
import o0OoO0oo.C28825o000ooO;
import o0OoO0oo.C28826o000ooO0;
import o0OoO0oo.C28832o00O00Oo;
import o0OoO0oo.C28961o00oOoOO;
import o0OoO0oo.C28963o00oOoo;
import o0OoO0oo.C28974o0OoO0o;
import o0OoO0oo.C28984oooo00o;
import o0OoO0oo.o00;
import o0OoO0oo.o000O0O0;
import o0OoO0oo.o000OO0O;
import o0OoO0oo.o00O00;
import o0OoO0oo.o00O000;
import o0OoO0oo.o00O0000;
import o0OoO0oo.o00O000o;
import o0OoO0oo.o00O00O;
import o0OoO0oo.o00O00o0;
import o0OoO0oo.o0O0ooO;
import o0OoO0oo.oOO00O;
import o0o0000o.C29728OooO0Oo;
import o0oOoOo.C31031OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33756Oooo0oO;
import oO0o0Oo.C33757Oooo0oo;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.C33785o0OoOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33767OoooOoo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33977OoooOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOo00O0O.C34467OooOo0;
import oOo00O0O.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C26577o000oo0O f73349OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f73350OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27020OooOoO0 f73351OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f73352OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f73353OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27295OooOO0O f73354OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27994OooOOOO f73355OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C27710OooO0oo f73356OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27869OooOOO f73357OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C27428o000oOoO f73358OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C27129OoooOOO f73359OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C27328OooO0OO f73360OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C27786OooO0OO f73361OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C27821OooO f73362OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C22194OoooOOo f73363OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f73364OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33769Ooooo0o f73365OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f73366OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f73367OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f73368OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f73369OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33781o00o0O f73370OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33781o00o0O f73371OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33769Ooooo0o f73372OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f73373OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33769Ooooo0o f73374OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33772OooooOo f73375OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f73376OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C33781o00o0O f73377Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33781o00o0O f73378Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33781o00o0O f73379Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33769Ooooo0o f73380Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33769Ooooo0o f73381Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C33769Ooooo0o f73382Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final AbstractC24338OooO0o0.OooO00o<Set<String>> f73383Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C33769Ooooo0o f73384Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C33769Ooooo0o f73385Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C33781o00o0O f73386Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C33781o00o0O f73387Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C33763OoooOOO f73388OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C33781o00o0O f73389OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C33781o00o0O f73390OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final C33781o00o0O f73391OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f73392OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final C33781o00o0O f73393OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f73394OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f73395OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f73396OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f73397OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final AbstractC24338OooO0o0.OooO00o<String> f73398Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooOo00 f73399Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final C33977OoooOOo f73400OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Map<String, C23353OooOoO0> f73401OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final C29728OooO0Oo f73402OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final Object f73403Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final C33781o00o0O f73404Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final LinkedHashMap f73405OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final LinkedHashSet f73406Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final C33769Ooooo0o f73407o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public final C33781o00o0O f73408o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public final C33781o00o0O f73409o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final C33781o00o0O f73410o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final C33769Ooooo0o f73411o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public final C33781o00o0O f73412o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final C33781o00o0O f73413o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final C33769Ooooo0o f73414o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final C33781o00o0O f73415o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final C33781o00o0O f73416o00000oO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public final C33769Ooooo0o f73417o0000Ooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final C33781o00o0O f73418o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C33781o00o0O f73419o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final C33781o00o0O f73420o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final C33781o00o0O f73421o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final C33769Ooooo0o f73422o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final C33769Ooooo0o f73423o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final C33769Ooooo0o f73424o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final C33781o00o0O f73425o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final C33769Ooooo0o f73426o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public Boolean f73427o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public final C33772OooooOo f73428o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final C33768Ooooo00 f73429o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final C33772OooooOo f73430o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final C33769Ooooo0o f73431o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final ConcurrentSkipListSet<String> f73432o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C33781o00o0O f73433o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final C33781o00o0O f73434o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final C33769Ooooo0o f73435oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public Boolean f73436oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final C33781o00o0O f73437ooOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$shouldUseImmersiveToolbar$preferredImmersiveToolbar$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {538}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73439OooOo0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73439OooOo0o;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26577o000oo0O c26577o000oo0O = oooO0OO.f73349OooO;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69582o00000OO;
                this.f73439OooOo0o = 1;
                obj = C25252OooO0Oo.OooOOo(new o00000OO(c26577o000oo0O.f91598OooO00o.getData(), oooO00o), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            oooO0OO.f73436oo0o0Oo = bool;
            return obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f73440OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f73441OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f73442OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f73443OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f73444OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f73445OooOoo0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o r0 = new com.orion.notein.ui.noteeditor.OooO0OO$OooO00o
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73441OooOo0o = r0
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o r1 = new com.orion.notein.ui.noteeditor.OooO0OO$OooO00o
                java.lang.String r2 = "TEXT"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73440OooOo = r1
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o r2 = new com.orion.notein.ui.noteeditor.OooO0OO$OooO00o
                java.lang.String r3 = "HYPERLINK"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73443OooOoO0 = r2
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o r3 = new com.orion.notein.ui.noteeditor.OooO0OO$OooO00o
                java.lang.String r4 = "TEXT_ANNO"
                r5 = 3
                r3.<init>(r4, r5)
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73442OooOoO = r3
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o r4 = new com.orion.notein.ui.noteeditor.OooO0OO$OooO00o
                java.lang.String r5 = "READING"
                r6 = 4
                r4.<init>(r5, r6)
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73444OooOoOO = r4
                com.orion.notein.ui.noteeditor.OooO0OO$OooO00o[] r0 = new com.orion.notein.ui.noteeditor.OooO0OO.OooO00o[]{r0, r1, r2, r3, r4}
                com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.f73445OooOoo0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.noteeditor.OooO0OO.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f73445OooOoo0.clone();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$getOrCreateRulerStateFlow$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1295}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73447OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33767OoooOoo<C29728OooO0Oo> f73448OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f73449OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, InterfaceC33767OoooOoo<C29728OooO0Oo> interfaceC33767OoooOoo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f73449OooOoO0 = str;
            this.f73448OooOoO = interfaceC33767OoooOoo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO0O0(this.f73449OooOoO0, this.f73448OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73447OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f73447OooOo0o = 1;
                obj = OooO0OO.OooO0o0(OooO0OO.this, this.f73449OooOoO0, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            this.f73448OooOoO.setValue((C29728OooO0Oo) obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$notifyBeginnerGuideDoNtShow$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1486}, m80625m = "invokeSuspend")
    public static final class C19263OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73451OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f73452OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$notifyBeginnerGuideDoNtShow$1$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f73453OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f73454OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ int f73455OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0OO oooO0OO, int i, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73453OooOo = oooO0OO;
                this.f73455OooOoO0 = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f73453OooOo, this.f73455OooOoO0, continuation);
                oooO00o.f73454OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f73454OooOo0o;
                OooO0OO oooO0OO = this.f73453OooOo;
                Set set = (Set) c24334OooO0O0.OooO0OO(oooO0OO.f73383Oooo0OO);
                Set setO0Oo0oo = set != null ? OooOo.o0Oo0oo(set) : new LinkedHashSet();
                setO0Oo0oo.add(String.valueOf(this.f73455OooOoO0));
                c24334OooO0O0.OooO0oO(oooO0OO.f73383Oooo0OO, setO0Oo0oo);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19263OooO0OO(int i, Continuation<? super C19263OooO0OO> continuation) {
            super(2, continuation);
            this.f73452OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C19263OooO0OO(this.f73452OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19263OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73451OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO oooO0OO = OooO0OO.this;
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooO0OO.f73364OooOOoo;
                OooO00o oooO00o = new OooO00o(oooO0OO, this.f73452OooOoO0, null);
                this.f73451OooOo0o = 1;
                if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$notifyBeginnerGuideShown$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f73456OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0Oo(int i, Continuation<? super OooO0Oo> continuation) {
            super(2, continuation);
            this.f73456OooOo = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO0Oo(this.f73456OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            int i = 0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO oooO0OO = OooO0OO.this;
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) oooO0OO.f73378Oooo0.getValue());
            Iterator it = arrayListO0ooOoO.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((C31031OooO0O0) it.next()).f110778OooO00o == this.f73456OooOo) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            arrayListO0ooOoO.set(i2, C31031OooO0O0.OooO00o((C31031OooO0O0) arrayListO0ooOoO.get(i2), false, 7));
            List listO00O0O = OooOo.o00O0O(arrayListO0ooOoO, C24536OooO0Oo.OooO00o(new C28816o000o0oO(0), new C28817o000o0oo(0), new C28819o000oOoo(i)));
            C33781o00o0O c33781o00o0O = oooO0OO.f73378Oooo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, listO00O0O);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$removeBeginnerGuide$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f73458OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f73458OooOo = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO0o(this.f73458OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO oooO0OO = OooO0OO.this;
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) oooO0OO.f73378Oooo0.getValue());
            final int i = this.f73458OooOo;
            C34431OooOo0.OooOoOO(arrayListO0ooOoO, new InterfaceC32507OooOO0o() { // from class: o0OoO0oo.o000ooOO
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(((C31031OooO0O0) obj2).f110778OooO00o == i);
                }
            });
            C33781o00o0O c33781o00o0O = oooO0OO.f73378Oooo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayListO0ooOoO);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$openNoteInEditor$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23333OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f73460OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f73462OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f73463OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ PointF f73464OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f73465OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23333OooO0o0(int i, String str, String str2, PointF pointF, String str3, Continuation<? super C23333OooO0o0> continuation) {
            super(2, continuation);
            this.f73460OooOo = i;
            this.f73463OooOoO0 = str;
            this.f73462OooOoO = str2;
            this.f73464OooOoOO = pointF;
            this.f73465OooOoo0 = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23333OooO0o0(this.f73460OooOo, this.f73463OooOoO0, this.f73462OooOoO, this.f73464OooOoOO, this.f73465OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23333OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0OO oooO0OO = OooO0OO.this;
            List list = (List) oooO0OO.f73389OoooO0.getValue();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C28961o00oOoOO c28961o00oOoOO = (C28961o00oOoOO) obj2;
                if (i == this.f73460OooOo) {
                    c28961o00oOoOO = new C28961o00oOoOO(this.f73463OooOoO0, this.f73462OooOoO, this.f73464OooOoOO, this.f73465OooOoo0);
                }
                arrayList.add(c28961o00oOoOO);
                i = i2;
            }
            C33781o00o0O c33781o00o0O = oooO0OO.f73389OoooO0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayList);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$setFullScreenMode$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1437}, m80625m = "invokeSuspend")
    public static final class C23334OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73467OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f73468OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23334OooO0oO(boolean z, Continuation<? super C23334OooO0oO> continuation) {
            super(2, continuation);
            this.f73468OooOoO0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23334OooO0oO(this.f73468OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23334OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73467OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26577o000oo0O c26577o000oo0O = OooO0OO.this.f73349OooO;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69583o00000Oo;
                this.f73467OooOo0o = 1;
                c26577o000oo0O.getClass();
                Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26687o0OoO0o(oooO00o, this.f73468OooOoO0, null), this);
                if (objOooO00o != obj2) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$setHandWriteMode$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {656}, m80625m = "invokeSuspend")
    public static final class C23335OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73470OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f73471OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23335OooO0oo(boolean z, Continuation<? super C23335OooO0oo> continuation) {
            super(2, continuation);
            this.f73471OooOoO0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23335OooO0oo(this.f73471OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23335OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73470OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27295OooOO0O interfaceC27295OooOO0O = OooO0OO.this.f73354OooO0oo;
                this.f73470OooOo0o = 1;
                if (interfaceC27295OooOO0O.OooO00o(this.f73471OooOoO0, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$shouldUseImmersiveToolbar$preferredReadingMode$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {543}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73473OooOo0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73473OooOo0o;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26577o000oo0O c26577o000oo0O = oooO0OO.f73349OooO;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69580o00000O;
                this.f73473OooOo0o = 1;
                obj = c26577o000oo0O.OooO0o(oooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            oooO0OO.f73427o0O0O00 = bool;
            return obj;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$updateBeginnerGuideReadyState$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1443}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73475OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f73476OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f73477OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$updateBeginnerGuideReadyState$1$currentSettings$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1447, 1456, 1458, 1465}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Set<? extends String>>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f73478OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public Object f73479OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f73480OooOoO0;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$updateBeginnerGuideReadyState$1$currentSettings$1$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19264OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f73481OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f73482OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19264OooO00o(AbstractC24338OooO0o0.OooO00o<Integer> oooO00o, Continuation<? super C19264OooO00o> continuation) {
                    super(2, continuation);
                    this.f73481OooOo = oooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19264OooO00o c19264OooO00o = new C19264OooO00o(this.f73481OooOo, continuation);
                    c19264OooO00o.f73482OooOo0o = obj;
                    return c19264OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19264OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    ((C24334OooO0O0) this.f73482OooOo0o).OooO0o(this.f73481OooOo);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$updateBeginnerGuideReadyState$1$currentSettings$1$2", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooO0OO f73483OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f73484OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ Set<String> f73485OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(OooO0OO oooO0OO, Set<String> set, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f73483OooOo = oooO0OO;
                    this.f73485OooOoO0 = set;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO0O0 oooO0O0 = new OooO0O0(this.f73483OooOo, this.f73485OooOoO0, continuation);
                    oooO0O0.f73484OooOo0o = obj;
                    return oooO0O0;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f73484OooOo0o;
                    OooO0OO oooO0OO = this.f73483OooOo;
                    Set set = (Set) c24334OooO0O0.OooO0OO(oooO0OO.f73383Oooo0OO);
                    Set setO0Oo0oo = set != null ? OooOo.o0Oo0oo(set) : new LinkedHashSet();
                    setO0Oo0oo.addAll(this.f73485OooOoO0);
                    c24334OooO0O0.OooO0oO(oooO0OO.f73383Oooo0OO, setO0Oo0oo);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0OO oooO0OO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f73480OooOoO0 = oooO0OO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f73480OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Set<? extends String>> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
            
                if (r11 != r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AbstractC24338OooO0o0.OooO00o<Integer> oooO00oOooO0OO;
                Set set;
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02;
                OooO0O0 oooO0O0;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f73478OooOo;
                OooO0OO oooO0OO = this.f73480OooOoO0;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    oooO00oOooO0OO = C24340OooO0oo.OooO0OO("input_types_for_showing_tips");
                    InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = oooO0OO.f73367OooOo00.getData();
                    this.f73479OooOo0o = oooO00oOooO0OO;
                    this.f73478OooOo = 1;
                    obj = C25252OooO0Oo.OooOOo(data, this);
                    if (obj != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i == 1) {
                    oooO00oOooO0OO = (AbstractC24338OooO0o0.OooO00o) this.f73479OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                } else {
                    if (i == 2) {
                        set = (Set) this.f73479OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        oooOO02 = oooO0OO.f73364OooOOoo;
                        oooO0O0 = new OooO0O0(oooO0OO, set, null);
                        this.f73479OooOo0o = null;
                        this.f73478OooOo = 3;
                        if (C24332OooO.OooO00o(oooOO02, oooO0O0, this) != enumC32485OooO00o) {
                            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data2 = oooO0OO.f73364OooOOoo.getData();
                            this.f73479OooOo0o = null;
                            this.f73478OooOo = 4;
                            obj = C25252OooO0Oo.OooOOo(data2, this);
                        }
                        return enumC32485OooO00o;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return ((AbstractC24338OooO0o0) obj).OooO0OO(oooO0OO.f73383Oooo0OO);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33721OooO0o<AbstractC24338OooO0o0> data22 = oooO0OO.f73364OooOOoo.getData();
                    this.f73479OooOo0o = null;
                    this.f73478OooOo = 4;
                    obj = C25252OooO0Oo.OooOOo(data22, this);
                }
                Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(oooO00oOooO0OO);
                if (num != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if ((1 & num.intValue()) == 0) {
                        linkedHashSet.add("0");
                    }
                    if ((num.intValue() & 2) == 0) {
                        linkedHashSet.add("1");
                    }
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO03 = oooO0OO.f73367OooOo00;
                    C19264OooO00o c19264OooO00o = new C19264OooO00o(oooO00oOooO0OO, null);
                    this.f73479OooOo0o = linkedHashSet;
                    this.f73478OooOo = 2;
                    if (C24332OooO.OooO00o(oooOO03, c19264OooO00o, this) != enumC32485OooO00o) {
                        set = linkedHashSet;
                        oooOO02 = oooO0OO.f73364OooOOoo;
                        oooO0O0 = new OooO0O0(oooO0OO, set, null);
                        this.f73479OooOo0o = null;
                        this.f73478OooOo = 3;
                        if (C24332OooO.OooO00o(oooOO02, oooO0O0, this) != enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(List<Integer> list, boolean z, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f73477OooOoO0 = list;
            this.f73476OooOoO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooOO0O(this.f73477OooOoO0, this.f73476OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73475OooOo0o;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooO00o oooO00o = new OooO00o(oooO0OO, null);
                this.f73475OooOo0o = 1;
                obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Set set = (Set) obj;
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((Collection) oooO0OO.f73378Oooo0.getValue());
            Iterator<T> it = this.f73477OooOoO0.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator it2 = arrayListO0ooOoO.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (((C31031OooO0O0) it2.next()).f110778OooO00o == iIntValue) {
                        break;
                    }
                    i2++;
                }
                boolean zContains = set != null ? set.contains(String.valueOf(iIntValue)) : false;
                if (i2 < 0 || zContains) {
                    C34406OooO00o.f123390OooO00o.OooO00o("updateBeginnerGuideReadyState: targetIndex=" + i2 + ", doNotShowAgain=" + zContains, new Object[0]);
                } else {
                    arrayListO0ooOoO.set(i2, C31031OooO0O0.OooO00o((C31031OooO0O0) arrayListO0ooOoO.get(i2), this.f73476OooOoO, 11));
                }
            }
            List listO00O0O = OooOo.o00O0O(arrayListO0ooOoO, C24536OooO0Oo.OooO00o(new C27862OooO0o(1), new C27864OooO0oO(1), new o00O00o0()));
            C33781o00o0O c33781o00o0O = oooO0OO.f73378Oooo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, listO00O0O);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0OO$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$updateNoteMetaLastOpenedTime$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {1197, 1198}, m80625m = "invokeSuspend")
    public static final class C23336OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73487OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f73488OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23336OooOO0o(String str, Continuation<? super C23336OooOO0o> continuation) {
            super(2, continuation);
            this.f73488OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23336OooOO0o(this.f73488OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23336OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73487OooOo0o;
            String str = this.f73488OooOoO0;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String strOooO0Oo = oooO0OO.f73359OooOOO0.OooO0Oo();
                this.f73487OooOo0o = 1;
                if (oooO0OO.f73352OooO0o0.OooOO0o(str, strOooO0Oo, this) != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27786OooO0OO c27786OooO0OO = oooO0OO.f73361OooOOOo;
            this.f73487OooOo0o = 2;
            c27786OooO0OO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27784OooO00o(c27786OooO0OO, str, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
        }
    }

    public OooO0OO(C27449o00O0OoO c27449o00O0OoO, InterfaceC27313OooOoo0 noteMetaRepo, C27020OooOoO0 c27020OooOoO0, o00000O getRemoteConfigUseCase, C27095OooOo0O c27095OooOo0O, InterfaceC27323Oooo0oO strokeRepo, InterfaceC27295OooOO0O customOperateRepo, C26577o000oo0O c26577o000oo0O, C27994OooOOOO c27994OooOOOO, C27710OooO0oo c27710OooO0oo, C27869OooOOO c27869OooOOO, C27129OoooOOO c27129OoooOOO, C27545o00o0oo0 c27545o00o0oo0, C27428o000oOoO brandSwitchUseCase, C27328OooO0OO analyticsUseCase, C27786OooO0OO createLatestOpenedNoteUseCase, C22194OoooOOo c22194OoooOOo, C27821OooO c27821OooO, o0000o0O.OooOO0 ignoreLoginStatusDataStore, o0000o0O.OooOO0 toolbarDataStore, o0000o0O.OooOO0 commonDataStore) {
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        OooOOO0.OooO0oO(customOperateRepo, "customOperateRepo");
        OooOOO0.OooO0oO(brandSwitchUseCase, "brandSwitchUseCase");
        OooOOO0.OooO0oO(analyticsUseCase, "analyticsUseCase");
        OooOOO0.OooO0oO(createLatestOpenedNoteUseCase, "createLatestOpenedNoteUseCase");
        OooOOO0.OooO0oO(ignoreLoginStatusDataStore, "ignoreLoginStatusDataStore");
        OooOOO0.OooO0oO(toolbarDataStore, "toolbarDataStore");
        OooOOO0.OooO0oO(commonDataStore, "commonDataStore");
        this.f73350OooO0Oo = c27449o00O0OoO;
        this.f73352OooO0o0 = noteMetaRepo;
        this.f73351OooO0o = c27020OooOoO0;
        this.f73353OooO0oO = strokeRepo;
        this.f73354OooO0oo = customOperateRepo;
        this.f73349OooO = c26577o000oo0O;
        this.f73355OooOO0 = c27994OooOOOO;
        this.f73356OooOO0O = c27710OooO0oo;
        this.f73357OooOO0o = c27869OooOOO;
        this.f73359OooOOO0 = c27129OoooOOO;
        this.f73358OooOOO = brandSwitchUseCase;
        this.f73360OooOOOO = analyticsUseCase;
        this.f73361OooOOOo = createLatestOpenedNoteUseCase;
        this.f73363OooOOo0 = c22194OoooOOo;
        this.f73362OooOOo = c27821OooO;
        this.f73364OooOOoo = ignoreLoginStatusDataStore;
        this.f73367OooOo00 = toolbarDataStore;
        this.f73366OooOo0 = commonDataStore;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f73369OooOo0o = c33781o00o0OOooO00o;
        this.f73365OooOo = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(null);
        this.f73371OooOoO0 = c33781o00o0OOooO00o2;
        this.f73370OooOoO = c33781o00o0OOooO00o2;
        AbstractC24338OooO0o0.OooO00o<Boolean> key = App.f69603oo0o0Oo;
        OooOOO0.OooO0oO(key, "key");
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c26577o000oo0O.f91598OooO00o;
        InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0o = C25252OooO0Oo.OooOO0o(new C26531o0000Ooo(oooOO02.getData(), key));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool = Boolean.FALSE;
        this.f73372OooOoOO = C25252OooO0Oo.OooOoO0(interfaceC33721OooO0oOooOO0o, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key2 = App.f69582o00000OO;
        OooOOO0.OooO0oO(key2, "key");
        this.f73374OooOoo0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(new o0OO00o0.o00000O(oooOO02.getData(), key2)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.TRUE);
        InterfaceC33721OooO0o data = toolbarDataStore.getData();
        AbstractC24338OooO0o0.OooO00o<Boolean> key3 = App.f69580o00000O;
        OooOOO0.OooO0oO(key3, "key");
        this.f73373OooOoo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(data, new C26537o0000oO0(oooOO02.getData(), key3), new C28813o000o0Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73375OooOooO = C33773Oooooo.OooO0O0(0, 0, 7);
        AbstractC24338OooO0o0.OooO00o<Boolean> key4 = App.f69599o0ooOO0;
        OooOOO0.OooO0oO(key4, "key");
        this.f73376OooOooo = C25252OooO0Oo.OooOoO0(new oo0o0Oo(oooOO02.getData(), key4, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(bool);
        this.f73379Oooo000 = c33781o00o0OOooO00o3;
        this.f73380Oooo00O = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o3);
        C26486OooOo0o c26486OooOo0oOooO0OO = customOperateRepo.OooO0OO();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f73381Oooo00o = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooOoO0(c26486OooOo0oOooO0OO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o2, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool), c33781o00o0OOooO00o3, new C28809o000o00o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(C31031OooO0O0.f110777OooO0o0);
        this.f73378Oooo0 = c33781o00o0OOooO00o4;
        InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(c33781o00o0OOooO00o4, 500L);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f73382Oooo0O0 = C25252OooO0Oo.OooOoO0(interfaceC33721OooO0oOooOO0O, interfaceC33636Oooo00oOooO00o3, c33779o00Oo0OooO00o2, c34434OooOoO);
        this.f73383Oooo0OO = C24340OooO0oo.OooO0o("beginner_guide_do_not_show_again_set");
        AbstractC24338OooO0o0.OooO00o<Boolean> key5 = App.f69571OooooOo;
        OooOOO0.OooO0oO(key5, "key");
        this.f73385Oooo0o0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(new o0000(oooOO02.getData(), key5)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key6 = App.f69563OoooOOo;
        OooOOO0.OooO0oO(key6, "key");
        this.f73384Oooo0o = C25252OooO0Oo.OooOoO0(new C26541o0000oo0(oooOO02.getData(), key6), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(new C32443OooOOO(0, null));
        this.f73386Oooo0oO = c33781o00o0OOooO00o5;
        this.f73387Oooo0oo = c33781o00o0OOooO00o5;
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(bool);
        this.f73377Oooo = c33781o00o0OOooO00o6;
        this.f73390OoooO00 = c33781o00o0OOooO00o6;
        String[] strArr = new String[2];
        for (int i = 0; i < 2; i++) {
            strArr[i] = "";
        }
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(new C28961o00oOoOO(strArr[i2], "", new PointF(0.0f, 0.0f), null));
        }
        C33781o00o0O c33781o00o0OOooO00o7 = C33784o00ooo.OooO00o(arrayList);
        this.f73389OoooO0 = c33781o00o0OOooO00o7;
        Boolean bool2 = Boolean.FALSE;
        C33781o00o0O c33781o00o0OOooO00o8 = C33784o00ooo.OooO00o(bool2);
        this.f73391OoooO0O = c33781o00o0OOooO00o8;
        this.f73388OoooO = new C33763OoooOOO(c33781o00o0OOooO00o7, c33781o00o0OOooO00o8, new C28814o000o0o(3, null));
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new o00O000(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o7, new o00(this, null))), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f73392OoooOO0 = c33769Ooooo0oOooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o7, new o00O0000(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33781o00o0O c33781o00o0OOooO00o9 = C33784o00ooo.OooO00o(0);
        this.f73419o000oOoO = c33781o00o0OOooO00o9;
        this.f73393OoooOOO = c33781o00o0OOooO00o9;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(new o00O000o(c33781o00o0OOooO00o9), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), -1);
        this.f73394OoooOOo = c33769Ooooo0oOooOoO03;
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o9, c33769Ooooo0oOooOoO02, new C28794o000Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73395OoooOo0 = c33769Ooooo0oOooOoO04;
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o9, c33769Ooooo0oOooOoO0, new C28798o000Oo0o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f73396OoooOoO = c33769Ooooo0oOooOoO05;
        C33769Ooooo0o c33769Ooooo0oOooOoO06 = C25252OooO0Oo.OooOoO0(new o00O00(c33769Ooooo0oOooOoO05), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "");
        this.f73397OoooOoo = c33769Ooooo0oOooOoO06;
        this.f73398Ooooo00 = C24340OooO0oo.OooO0o0("note_ruler_states_v1");
        this.f73399Ooooo0o = C34467OooOo0.OooO00o(new o000OO0O(0));
        this.f73400OooooO0 = C33928OooO00o.OooO0O0(oO0oO00.o00000OO.f122230OooO00o, C23353OooOoO0.Companion.serializer());
        C29728OooO0Oo c29728OooO0Oo = new C29728OooO0Oo(62);
        this.f73402OooooOo = c29728OooO0Oo;
        this.f73404Oooooo0 = C33784o00ooo.OooO00o(c29728OooO0Oo);
        this.f73403Oooooo = new Object();
        this.f73405OoooooO = new LinkedHashMap();
        this.f73406Ooooooo = new LinkedHashSet();
        this.f73431o0OoOo0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO06, new o0O0ooO(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c29728OooO0Oo);
        C33781o00o0O c33781o00o0OOooO00o10 = C33784o00ooo.OooO00o(bool2);
        this.f73437ooOO = c33781o00o0OOooO00o10;
        this.f73420o00O0O = c33781o00o0OOooO00o10;
        OooO00o oooO00o = OooO00o.f73441OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o11 = C33784o00ooo.OooO00o(oooO00o);
        this.f73421o00Oo0 = c33781o00o0OOooO00o11;
        C26577o000oo0O c26577o000oo0O2 = this.f73349OooO;
        AbstractC24338OooO0o0.OooO00o<Boolean> key7 = App.f69580o00000O;
        c26577o000oo0O2.getClass();
        OooOOO0.OooO0oO(key7, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO07 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o11, new C26537o0000oO0(c26577o000oo0O2.f91598OooO00o.getData(), key7), new C23338OooO0o0(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), oooO00o);
        this.f73422o00Ooo = c33769Ooooo0oOooOoO07;
        C26577o000oo0O c26577o000oo0O3 = this.f73349OooO;
        AbstractC24338OooO0o0.OooO00o<Boolean> key8 = App.f69583o00000Oo;
        c26577o000oo0O3.getClass();
        OooOOO0.OooO0oO(key8, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO08 = C25252OooO0Oo.OooOoO0(new o00000(c26577o000oo0O3.f91598OooO00o.getData(), key8), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f73423o00o0O = c33769Ooooo0oOooOoO08;
        this.f73426o00ooo = C25252OooO0Oo.OooOoO0(new o00O00O(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f73435oo000o = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO07, c33769Ooooo0oOooOoO08, new C23337OooO0Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C33781o00o0O c33781o00o0OOooO00o12 = C33784o00ooo.OooO00o(bool2);
        this.f73425o00oO0o = c33781o00o0OOooO00o12;
        this.f73424o00oO0O = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o12, c33769Ooooo0oOooOoO08, new C28984oooo00o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C26577o000oo0O c26577o000oo0O4 = this.f73349OooO;
        c26577o000oo0O4.getClass();
        C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO08, new C26537o0000oO0(c26577o000oo0O4.f91598OooO00o.getData(), key7), new C28832o00O00Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Integer.valueOf(o000000O.OooO0o(20)));
        this.f73432o0ooOO0 = new ConcurrentSkipListSet<>();
        C33781o00o0O c33781o00o0OOooO00o13 = C33784o00ooo.OooO00o(bool2);
        this.f73433o0ooOOo = c33781o00o0OOooO00o13;
        this.f73434o0ooOoO = c33781o00o0OOooO00o13;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(new oOO00O(c33769Ooooo0oOooOoO04, this), new C28963o00oOoo(3, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o4 = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o4, executorC33873OooO0O02);
        C33779o00Oo0 c33779o00Oo0OooO00o3 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C33785o0OoOo0 c33785o0OoOo0OooO00o = C33757Oooo0oo.OooO00o(c33799OooOO0OOooOoO, 0);
        C33772OooooOo c33772OooooOoOooO00o = C33773Oooooo.OooO00o(0, c33785o0OoOo0OooO00o.f121813OooO0O0, c33785o0OoOo0OooO00o.f121814OooO0OO);
        this.f73429o0OOO0o = new C33768Ooooo00(c33772OooooOoOooO00o, C33609OooO0oo.OooO0O0(c33822OooO0OOOooO0oO, c33785o0OoOo0OooO00o.f121815OooO0Oo, c33779o00Oo0OooO00o3.equals(InterfaceC33788ooOO.OooO00o.f121818OooO00o) ? EnumC33637Oooo0O0.f121317OooOo0o : EnumC33637Oooo0O0.f121318OooOoO, new C33756Oooo0oO(c33779o00Oo0OooO00o3, c33785o0OoOo0OooO00o.f121812OooO00o, c33772OooooOoOooO00o, C33773Oooooo.f121761OooO00o, null)));
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f73430o0Oo0oo = c33772OooooOoOooO0O0;
        this.f73428o0OO00O = c33772OooooOoOooO0O0;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O02), null, null, new o000O0O0(this, null), 3);
        C33781o00o0O c33781o00o0OOooO00o14 = C33784o00ooo.OooO00o(1);
        this.f73418o000OOo = c33781o00o0OOooO00o14;
        this.f73408o000000 = c33781o00o0OOooO00o14;
        C33781o00o0O c33781o00o0OOooO00o15 = C33784o00ooo.OooO00o(OooO0O0.OooO00o.f75497OooOo0o);
        this.f73409o000000O = c33781o00o0OOooO00o15;
        this.f73410o000000o = c33781o00o0OOooO00o15;
        this.f73407o00000 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o14, c33781o00o0OOooO00o15, new C28974o0OoO0o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C33784o00ooo.OooO00o(Boolean.TRUE);
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o16 = C33784o00ooo.OooO00o(c34436OooOoOO);
        this.f73412o00000O0 = c33781o00o0OOooO00o16;
        this.f73411o00000O = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o16, c33769Ooooo0oOooOoO05, new C28812o000o0OO(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C33781o00o0O c33781o00o0OOooO00o17 = C33784o00ooo.OooO00o(c34436OooOoOO);
        this.f73413o00000OO = c33781o00o0OOooO00o17;
        this.f73414o00000Oo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO03, c33781o00o0OOooO00o17, new C28806o000o00(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        C33781o00o0O c33781o00o0OOooO00o18 = C33784o00ooo.OooO00o(c34436OooOoOO);
        this.f73415o00000o0 = c33781o00o0OOooO00o18;
        this.f73417o0000Ooo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO03, c33781o00o0OOooO00o18, new C28808o000o00O(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f73416o00000oO = C33784o00ooo.OooO00o(new C32443OooOOO("", new RectF()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(OooO0OO oooO0OO, Context context, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28821o000oo0 c28821o000oo0;
        boolean zOooo0oo;
        Object objOooO0o;
        OooO0OO oooO0OO2;
        boolean z;
        Context context2;
        OooO0OO oooO0OO3;
        OooO0OO oooO0OO4;
        oooO0OO.getClass();
        if (abstractC32479OooO0OO instanceof C28821o000oo0) {
            c28821o000oo0 = (C28821o000oo0) abstractC32479OooO0OO;
            int i = c28821o000oo0.f102036OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28821o000oo0.f102036OooOoo = i - Integer.MIN_VALUE;
            } else {
                c28821o000oo0 = new C28821o000oo0(oooO0OO, abstractC32479OooO0OO);
            }
        }
        Object obj = c28821o000oo0.f102035OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28821o000oo0.f102036OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zOooo0oo = oooO0OO.Oooo0oo(context);
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69580o00000O;
            c28821o000oo0.f102032OooOo0o = oooO0OO;
            c28821o000oo0.f102031OooOo = context;
            c28821o000oo0.f102034OooOoO0 = oooO0OO;
            c28821o000oo0.f102033OooOoO = zOooo0oo;
            c28821o000oo0.f102036OooOoo = 1;
            objOooO0o = oooO0OO.f73349OooO.OooO0o(oooO00o, c28821o000oo0);
            if (objOooO0o != enumC32485OooO00o) {
                oooO0OO2 = oooO0OO;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            boolean z2 = c28821o000oo0.f102033OooOoO;
            OooO0OO oooO0OO5 = c28821o000oo0.f102034OooOoO0;
            Context context3 = c28821o000oo0.f102031OooOo;
            oooO0OO2 = c28821o000oo0.f102032OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            zOooo0oo = z2;
            oooO0OO = oooO0OO5;
            context = context3;
            objOooO0o = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            z = c28821o000oo0.f102033OooOoO;
            oooO0OO3 = c28821o000oo0.f102034OooOoO0;
            context2 = c28821o000oo0.f102031OooOo;
            oooO0OO4 = c28821o000oo0.f102032OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            oooO0OO3.f73436oo0o0Oo = (Boolean) obj;
            if (z != oooO0OO4.Oooo0oo(context2)) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33772OooooOo c33772OooooOo = oooO0OO4.f73430o0Oo0oo;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c28821o000oo0.f102032OooOo0o = null;
            c28821o000oo0.f102031OooOo = null;
            c28821o000oo0.f102034OooOoO0 = null;
            c28821o000oo0.f102036OooOoo = 3;
        }
        oooO0OO.f73427o0O0O00 = (Boolean) objOooO0o;
        C26577o000oo0O c26577o000oo0O = oooO0OO2.f73349OooO;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = App.f69582o00000OO;
        c28821o000oo0.f102032OooOo0o = oooO0OO2;
        c28821o000oo0.f102031OooOo = context;
        c28821o000oo0.f102034OooOoO0 = oooO0OO2;
        c28821o000oo0.f102033OooOoO = zOooo0oo;
        c28821o000oo0.f102036OooOoo = 2;
        Object objOooOOo = C25252OooO0Oo.OooOOo(new o00000OO(c26577o000oo0O.f91598OooO00o.getData(), oooO00o2), c28821o000oo0);
        if (objOooOOo != enumC32485OooO00o) {
            boolean z3 = zOooo0oo;
            obj = objOooOOo;
            z = z3;
            context2 = context;
            oooO0OO3 = oooO0OO2;
            oooO0OO4 = oooO0OO3;
            oooO0OO3.f73436oo0o0Oo = (Boolean) obj;
            if (z != oooO0OO4.Oooo0oo(context2)) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(OooO0OO oooO0OO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28815o000o0o0 c28815o000o0o0;
        Object objOooO00o;
        String str2;
        Object objOooOOOO;
        oooO0OO.getClass();
        if (abstractC32479OooO0OO instanceof C28815o000o0o0) {
            c28815o000o0o0 = (C28815o000o0o0) abstractC32479OooO0OO;
            int i = c28815o000o0o0.f102023OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28815o000o0o0.f102023OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28815o000o0o0 = new C28815o000o0o0(oooO0OO, abstractC32479OooO0OO);
            }
        }
        C28815o000o0o0 c28815o000o0o02 = c28815o000o0o0;
        Object obj = c28815o000o0o02.f102020OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28815o000o0o02.f102023OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int length = str.length();
            C29728OooO0Oo c29728OooO0Oo = oooO0OO.f73402OooooOo;
            if (length == 0) {
                return c29728OooO0Oo;
            }
            try {
                objOooO00o = oooO0OO.f73359OooOOO0.OooO0Oo();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorContainerViewModel");
                c20358OooO00o.OooOO0o(thOooO00o, "Failed to load ruler state: missing uid", new Object[0]);
                return c29728OooO0Oo;
            }
            str2 = (String) objOooO00o;
            c28815o000o0o02.f102019OooOo0o = oooO0OO;
            c28815o000o0o02.f102018OooOo = str;
            c28815o000o0o02.f102021OooOoO0 = str2;
            c28815o000o0o02.f102023OooOoo0 = 1;
            objOooOOOO = oooO0OO.OooOOOO(c28815o000o0o02);
            if (objOooOOOO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = c28815o000o0o02.f102021OooOoO0;
            str = c28815o000o0o02.f102018OooOo;
            OooO0OO oooO0OO2 = c28815o000o0o02.f102019OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str3;
            oooO0OO = oooO0OO2;
            objOooOOOO = obj;
        }
        oooO0OO.getClass();
        C23353OooOoO0 c23353OooOoO0 = (C23353OooOoO0) ((Map) objOooOOOO).get(str2 + C18115b5.CONNECTOR + str);
        if (c23353OooOoO0 == null) {
            return oooO0OO.f73402OooooOo;
        }
        return new C29728OooO0Oo(c23353OooOoO0.f73686OooO00o, new PointF(c23353OooOoO0.f73687OooO0O0, c23353OooOoO0.f73688OooO0OO), c23353OooOoO0.f73689OooO0Oo, c23353OooOoO0.f73691OooO0o0, c23353OooOoO0.f73690OooO0o, c23353OooOoO0.f73692OooO0oO);
    }

    public static /* synthetic */ void OooOo0(OooO0OO oooO0OO, String str, int i) {
        oooO0OO.OooOo00(str, i, "", new PointF(0.0f, 0.0f), null);
    }

    public final Object OooO(String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28797o000Oo0O(this, str, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooO0oO(String noteId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        C33781o00o0O c33781o00o0O = this.f73389OoooO0;
        List list = (List) c33781o00o0O.getValue();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((C28961o00oOoOO) obj).f102615OooO00o.length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (OooOOO0.OooO0O0(((C28961o00oOoOO) obj2).f102615OooO00o, noteId)) {
                arrayList2.add(obj2);
            }
        }
        int size = arrayList2.size();
        int size2 = list.size();
        C33781o00o0O c33781o00o0O2 = this.f73419o000oOoO;
        if (size == size2) {
            int iIntValue = ((Number) c33781o00o0O2.getValue()).intValue();
            List list3 = list;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            int i = 0;
            for (Object obj3 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C28961o00oOoOO c28961o00oOoOO = (C28961o00oOoOO) obj3;
                if (iIntValue != i) {
                    c28961o00oOoOO = new C28961o00oOoOO("", "", new PointF(0.0f, 0.0f), null);
                }
                arrayList3.add(c28961o00oOoOO);
                i = i2;
            }
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayList3);
        } else {
            List<C28961o00oOoOO> list4 = list;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (C28961o00oOoOO c28961o00oOoOO2 : list4) {
                if (noteId.equals(c28961o00oOoOO2.f102615OooO00o)) {
                    c28961o00oOoOO2 = new C28961o00oOoOO("", "", new PointF(0.0f, 0.0f), null);
                }
                arrayList4.add(c28961o00oOoOO2);
            }
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, arrayList4);
            Iterator it = arrayList4.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((C28961o00oOoOO) it.next()).f102615OooO00o.length() > 0) {
                    break;
                } else {
                    i3++;
                }
            }
            Integer numValueOf = Integer.valueOf(i3);
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, numValueOf);
        }
        Oooo0OO(0, null);
        OoooO(noteId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        r13 = r0;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(Outline outline, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28791o000OOO c28791o000OOO;
        Iterator<String> it;
        OooO0OO oooO0OO;
        C28791o000OOO c28791o000OOO2;
        OooO0OO oooO0OO2;
        Iterator<String> it2;
        Outline outline2;
        Object next;
        if (abstractC32479OooO0OO instanceof C28791o000OOO) {
            c28791o000OOO = (C28791o000OOO) abstractC32479OooO0OO;
            int i = c28791o000OOO.f101952OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28791o000OOO.f101952OooOoo = i - Integer.MIN_VALUE;
            } else {
                c28791o000OOO = new C28791o000OOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28791o000OOO.f101951OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28791o000OOO.f101952OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            list.add(outline);
            it = outline.getChildren().iterator();
            oooO0OO = this;
            if (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 == 1) {
            Iterator<String> it3 = c28791o000OOO.f101949OooOoO;
            list = c28791o000OOO.f101950OooOoO0;
            Outline outline3 = c28791o000OOO.f101947OooOo;
            oooO0OO2 = c28791o000OOO.f101948OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c28791o000OOO2 = c28791o000OOO;
            it2 = it3;
            outline = outline3;
            C28791o000OOO c28791o000OOO3 = c28791o000OOO2;
            outline2 = (Outline) obj;
            if (outline2 == null) {
            }
            oooO0OO = oooO0OO2;
            if (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator<String> it4 = c28791o000OOO.f101949OooOoO;
        list = c28791o000OOO.f101950OooOoO0;
        Outline outline4 = c28791o000OOO.f101947OooOo;
        oooO0OO2 = c28791o000OOO.f101948OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        it = it4;
        outline = outline4;
        oooO0OO = oooO0OO2;
        if (it.hasNext()) {
            String next2 = it.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
                if (OooOOO0.OooO0O0(((Outline) next).getId(), next2)) {
                    break;
                }
            }
            if (next == null) {
                C27869OooOOO c27869OooOOO = oooO0OO.f73357OooOO0o;
                String noteId = outline.getNoteId();
                c28791o000OOO.f101948OooOo0o = oooO0OO;
                c28791o000OOO.f101947OooOo = outline;
                c28791o000OOO.f101950OooOoO0 = list;
                c28791o000OOO.f101949OooOoO = it;
                c28791o000OOO.f101952OooOoo = 1;
                Object objOooO0O0 = c27869OooOOO.OooO0O0(next2, noteId, c28791o000OOO);
                if (objOooO0O0 != enumC32485OooO00o) {
                    c28791o000OOO2 = c28791o000OOO;
                    it2 = it;
                    obj = objOooO0O0;
                    oooO0OO2 = oooO0OO;
                    C28791o000OOO c28791o000OOO32 = c28791o000OOO2;
                    outline2 = (Outline) obj;
                    if (outline2 == null) {
                        c28791o000OOO32.f101948OooOo0o = oooO0OO2;
                        c28791o000OOO32.f101947OooOo = outline;
                        c28791o000OOO32.f101950OooOoO0 = list;
                        c28791o000OOO32.f101949OooOoO = it2;
                        c28791o000OOO32.f101952OooOoo = 2;
                        if (oooO0OO2.OooO0oo(outline2, list, c28791o000OOO32) != enumC32485OooO00o) {
                            it = it2;
                            c28791o000OOO = c28791o000OOO32;
                        }
                    }
                    oooO0OO = oooO0OO2;
                    if (it.hasNext()) {
                    }
                }
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooOO0() {
        NoteContent noteContent = (NoteContent) this.f73396OoooOoO.f121747OooOo0o.getValue();
        if (noteContent == null) {
            return null;
        }
        List<Page> pages = noteContent.getPages();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
        Iterator<T> it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Page) it.next()).getId());
        }
        return (String) OooOo.OoooO00(noteContent.getSavedPageIndex(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooOO0O() {
        String id;
        NoteContent noteContent = (NoteContent) this.f73396OoooOoO.f121747OooOo0o.getValue();
        return (noteContent == null || (id = noteContent.getId()) == null) ? "" : id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList OooOO0o(List list, String str, String str2, PointF pointF, String str3) {
        int i = 0;
        if (((Number) ((C32443OooOOO) this.f73386Oooo0oO.getValue()).f116638OooOo0o).intValue() != 0) {
            int iIntValue = (((Number) this.f73419o000oOoO.getValue()).intValue() + 1) % 2;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C28961o00oOoOO c28961o00oOoOO = (C28961o00oOoOO) obj;
                if (i == iIntValue) {
                    c28961o00oOoOO = new C28961o00oOoOO(str, str2, pointF, str3);
                }
                arrayList.add(c28961o00oOoOO);
                i = i2;
            }
            return arrayList;
        }
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((C28961o00oOoOO) it.next()).f102615OooO00o.length() == 0) {
                break;
            }
            i3++;
        }
        List<C28961o00oOoOO> list3 = list;
        for (C28961o00oOoOO c28961o00oOoOO2 : list3) {
            if (c28961o00oOoOO2.f102615OooO00o.length() > 0) {
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                for (Object obj2 : list3) {
                    int i4 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    arrayList2.add(i == i3 ? new C28961o00oOoOO(str, str2, pointF, str3) : c28961o00oOoOO2);
                    i = i4;
                }
                return arrayList2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final InterfaceC33767OoooOoo<C29728OooO0Oo> OooOOO(String str) {
        InterfaceC33767OoooOoo<C29728OooO0Oo> interfaceC33767OoooOoo;
        boolean zAdd;
        if (C33599OooOo0O.Oooo0o0(str)) {
            return this.f73404Oooooo0;
        }
        synchronized (this.f73403Oooooo) {
            try {
                LinkedHashMap linkedHashMap = this.f73405OoooooO;
                Object objOooO00o = linkedHashMap.get(str);
                if (objOooO00o == null) {
                    objOooO00o = C33784o00ooo.OooO00o(this.f73402OooooOo);
                    linkedHashMap.put(str, objOooO00o);
                }
                interfaceC33767OoooOoo = (InterfaceC33767OoooOoo) objOooO00o;
                zAdd = this.f73406Ooooooo.add(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zAdd) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0O0(str, interfaceC33767OoooOoo, null), 2);
        }
        return interfaceC33767OoooOoo;
    }

    public final ArrayList OooOOO0() {
        Iterable iterable = (Iterable) this.f73389OoooO0.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C28961o00oOoOO) it.next()).f102615OooO00o);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28807o000o000 c28807o000o000;
        OooO0OO oooO0OO;
        Map<String, C23353OooOoO0> linkedHashMap;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C28807o000o000) {
            c28807o000o000 = (C28807o000o000) abstractC32479OooO0OO;
            int i = c28807o000o000.f102002OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28807o000o000.f102002OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28807o000o000 = new C28807o000o000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c28807o000o000.f102000OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28807o000o000.f102002OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            Map<String, C23353OooOoO0> map = this.f73401OooooOO;
            if (map != null) {
                return map;
            }
            C27078OooO0o0 c27078OooO0o0 = new C27078OooO0o0(this.f73367OooOo00.getData(), this, 1);
            c28807o000o000.f102001OooOo0o = this;
            c28807o000o000.f102002OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c27078OooO0o0, c28807o000o000);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0OO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0OO = c28807o000o000.f102001OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        String str = (String) objOooOOo;
        if (str == null || C33599OooOo0O.Oooo0o0(str)) {
            linkedHashMap = new LinkedHashMap<>();
        } else {
            try {
                objOooO00o = C34444Oooo0O0.OooOOOO((Map) oooO0OO.f73399Ooooo0o.OooO0O0(str, oooO0OO.f73400OooooO0));
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorContainerViewModel");
                c20358OooO00o.OooOO0o(thOooO00o, "Unable to decode ruler states", new Object[0]);
                objOooO00o = new LinkedHashMap();
            }
            linkedHashMap = (Map) objOooO00o;
        }
        oooO0OO.f73401OooooOO = linkedHashMap;
        return linkedHashMap;
    }

    public final boolean OooOOOo(String noteId, String pageId, PointF pointF, String itemId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(itemId, "itemId");
        List list = (List) this.f73389OoooO0.getValue();
        ArrayList arrayListOooOO0o = OooOO0o(list, noteId, pageId, pointF, itemId);
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C28961o00oOoOO) it.next()).f102615OooO00o);
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooOO0o, 10));
        Iterator it2 = arrayListOooOO0o.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C28961o00oOoOO) it2.next()).f102615OooO00o);
        }
        return arrayList.equals(arrayList2);
    }

    public final void OooOOo(int i) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO0Oo(i, null), 3);
    }

    public final void OooOOo0(int i) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C19263OooO0OO(i, null), 2);
    }

    public final void OooOOoo(String noteId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOo0(this, noteId, ((Number) this.f73419o000oOoO.getValue()).intValue());
    }

    public final void OooOo(String noteId, String pageId, PointF pointF, String str, boolean z) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C28823o000oo0O(this, noteId, pageId, pointF, str, 2, z, null), 3);
    }

    public final void OooOo00(String noteId, int i, String pageId, PointF pointF, String str) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23333OooO0o0(i, noteId, pageId, pointF, str, null), 3);
        OoooO(noteId);
    }

    public final void OooOo0O(String noteId, String pageId, PointF pointF, String str, boolean z) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(pageId, "pageId");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C28823o000oo0O(this, noteId, pageId, pointF, str, 1, z, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28826o000ooO0 c28826o000ooO0;
        if (abstractC32479OooO0OO instanceof C28826o000ooO0) {
            c28826o000ooO0 = (C28826o000ooO0) abstractC32479OooO0OO;
            int i = c28826o000ooO0.f102058OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28826o000ooO0.f102058OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28826o000ooO0 = new C28826o000ooO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28826o000ooO0.f102057OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28826o000ooO0.f102058OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) this.f73396OoooOoO.f121747OooOo0o.getValue();
        if (noteContent == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("No note focused"));
        }
        String id = noteContent.getId();
        c28826o000ooO0.f102058OooOoO0 = 1;
        Object objOooO0O0 = this.f73362OooOOo.OooO0O0(id, c28826o000ooO0);
        return objOooO0O0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoOO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28825o000ooO c28825o000ooO;
        if (abstractC32479OooO0OO instanceof C28825o000ooO) {
            c28825o000ooO = (C28825o000ooO) abstractC32479OooO0OO;
            int i = c28825o000ooO.f102055OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28825o000ooO.f102055OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28825o000ooO = new C28825o000ooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28825o000ooO.f102054OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28825o000ooO.f102055OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = (NoteContent) this.f73396OoooOoO.f121747OooOo0o.getValue();
        if (noteContent == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("No note focused"));
        }
        String strOooOO0 = OooOO0();
        if (strOooOO0 == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("No current page"));
        }
        String id = noteContent.getId();
        c28825o000ooO.f102055OooOoO0 = 1;
        Object objOooO0OO = this.f73362OooOOo.OooO0OO(id, strOooOO0, c28825o000ooO);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }

    public final void OooOoo(int i, int i2) {
        C33781o00o0O c33781o00o0O = this.f73413o00000OO;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO((Map) c33781o00o0O.getValue());
        linkedHashMapOooOOOO.put(Integer.valueOf(i), Integer.valueOf(i2));
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, linkedHashMapOooOOOO);
    }

    public final void OooOoo0(int i) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO0o(i, null), 3);
    }

    public final void OooOooO(int i, int i2) {
        C33781o00o0O c33781o00o0O = this.f73415o00000o0;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO((Map) c33781o00o0O.getValue());
        linkedHashMapOooOOOO.put(Integer.valueOf(i), Integer.valueOf(i2));
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, linkedHashMapOooOOOO);
    }

    public final void OooOooo(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C33781o00o0O c33781o00o0O = this.f73425o00oO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo() {
        C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f73387Oooo0oo.getValue();
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        C33781o00o0O c33781o00o0O = this.f73386Oooo0oO;
        if (iIntValue == 2) {
            C32443OooOOO c32443OooOOO2 = new C32443OooOOO(1, null);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO2);
        } else if (((Number) c32443OooOOO.f116638OooOo0o).intValue() == 1) {
            C32443OooOOO c32443OooOOO3 = new C32443OooOOO(2, null);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO3);
        }
    }

    public final void Oooo0(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C33781o00o0O c33781o00o0O = this.f73379Oooo000;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
    }

    public final void Oooo000(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f73419o000oOoO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    public final void Oooo00O(boolean z) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23334OooO0oO(z, null), 2);
    }

    public final void Oooo00o(boolean z) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23335OooO0oo(z, null), 2);
    }

    public final void Oooo0O0(String str, boolean z) {
        C33781o00o0O c33781o00o0O = this.f73412o00000O0;
        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO((Map) c33781o00o0O.getValue());
        linkedHashMapOooOOOO.put(str, Boolean.valueOf(z));
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, linkedHashMapOooOOOO);
    }

    public final void Oooo0OO(int i, Integer num) {
        C33781o00o0O c33781o00o0O = this.f73419o000oOoO;
        if (num != null) {
            Integer numValueOf = Integer.valueOf(num.intValue());
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, numValueOf);
        }
        if (i == 0) {
            int iIntValue = ((Number) c33781o00o0O.getValue()).intValue();
            Iterable iterable = (Iterable) this.f73389OoooO0.getValue();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                if (i2 != iIntValue) {
                    arrayList.add(obj);
                }
                i2 = i3;
            }
            C28961o00oOoOO c28961o00oOoOO = (C28961o00oOoOO) OooOo.Oooo(arrayList);
            if (c28961o00oOoOO != null) {
                OooO0oO(c28961o00oOoOO.f102615OooO00o);
            }
        }
        C32443OooOOO c32443OooOOO = new C32443OooOOO(Integer.valueOf(i), null);
        C33781o00o0O c33781o00o0O2 = this.f73386Oooo0oO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, c32443OooOOO);
    }

    public final void Oooo0o(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f73418o000OOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    public final void Oooo0o0(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C33781o00o0O c33781o00o0O = this.f73433o0ooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
    }

    public final void Oooo0oO(OooO00o oooO00o) {
        C33781o00o0O c33781o00o0O = this.f73421o00Oo0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO00o);
    }

    public final boolean Oooo0oo(Context context) {
        OooOOO0.OooO0oO(context, "context");
        Boolean bool = this.f73436oo0o0Oo;
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : ((Boolean) C33609OooO0oo.OooO0Oo(oooO, new OooO(null))).booleanValue();
        Boolean bool2 = this.f73427o0O0O00;
        return zBooleanValue || (bool2 != null ? bool2.booleanValue() : ((Boolean) C33609OooO0oo.OooO0Oo(oooO, new OooOO0(null))).booleanValue()) || C28038OooO0Oo.OooO0O0(context);
    }

    public final void OoooO(String str) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C23336OooOO0o(str, null), 3);
    }

    public final boolean OoooO0() {
        String strOooOO0O = OooOO0O();
        if (strOooOO0O.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorContainerViewModel");
            c20358OooO00o.OooOO0O("toggleRulerVisibility skipped: empty noteId", new Object[0]);
            return false;
        }
        InterfaceC33767OoooOoo<C29728OooO0Oo> interfaceC33767OoooOooOooOOO = OooOOO(strOooOO0O);
        C29728OooO0Oo value = interfaceC33767OoooOooOooOOO.getValue();
        boolean z = !value.f105431OooO00o;
        C29728OooO0Oo c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(value, z, null, 0.0f, 0.0f, 0.0f, 62);
        PointF pointF = c29728OooO0OoOooO00o.f105432OooO0O0;
        C29728OooO0Oo c29728OooO0OoOooO00o2 = C29728OooO0Oo.OooO00o(c29728OooO0OoOooO00o, false, new PointF(pointF.x, pointF.y), 0.0f, 0.0f, 0.0f, 61);
        interfaceC33767OoooOooOooOOO.setValue(c29728OooO0OoOooO00o2);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28824o000oo0o(strOooOO0O, this, c29728OooO0OoOooO00o2, null), 2);
        return z;
    }

    public final void OoooO00() {
        C33781o00o0O c33781o00o0O = this.f73389OoooO0;
        ArrayList arrayListO0ooOoO = OooOo.o0ooOoO((List) c33781o00o0O.getValue());
        Collections.reverse(arrayListO0ooOoO);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayListO0ooOoO);
    }

    public final void OoooO0O(List<Integer> list, boolean z) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooOO0O(list, z, null), 3);
    }

    public final void OoooOO0(String str, C29728OooO0Oo state) {
        OooOOO0.OooO0oO(state, "state");
        if (str.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorContainerViewModel");
            c20358OooO00o.OooOO0O("updateRulerStateFromEditor skipped: empty noteId", new Object[0]);
            return;
        }
        PointF pointF = state.f105432OooO0O0;
        C29728OooO0Oo c29728OooO0OoOooO00o = C29728OooO0Oo.OooO00o(state, false, new PointF(pointF.x, pointF.y), 0.0f, 0.0f, 0.0f, 61);
        OooOOO(str).setValue(c29728OooO0OoOooO00o);
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteEditorContainerViewModel");
        Boolean boolValueOf = Boolean.valueOf(c29728OooO0OoOooO00o.f105431OooO00o);
        PointF pointF2 = c29728OooO0OoOooO00o.f105432OooO0O0;
        c20358OooO00o2.OooOO0("updateRulerStateFromEditor -> noteId=%s visible=%s center=(%.1f, %.1f) angle=%.3f length=%.1f", str, boolValueOf, Float.valueOf(pointF2.x), Float.valueOf(pointF2.y), Float.valueOf(c29728OooO0OoOooO00o.f105434OooO0Oo), Float.valueOf(c29728OooO0OoOooO00o.f105433OooO0OO));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28824o000oo0o(str, this, c29728OooO0OoOooO00o, null), 2);
    }
}
