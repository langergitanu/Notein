package com.orion.notein.p607ui.noteeditor.penbar;

import Oooo0.C20860Ooooooo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.EditingLanguage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.oplus.ipemanager.sdk.ISdkAidlInterface;
import com.oplus.ipemanager.sdk.IpeFeature;
import com.orion.notein.App;
import com.orion.notein.data.p602db.entity.BundleTypeAdapterFactory;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.domain.models.note.ToolBoxInfo;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import o000oo0.C24684Oooo;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0O0OoO0.C25895OooO00o;
import o0OO.C26428Oooo0OO;
import o0OO.C26433OoooO0;
import o0OO.C26435OoooO0O;
import o0OO00o0.C26533o0000o0;
import o0OO00o0.C26534o0000o0O;
import o0OO00o0.C26535o0000o0o;
import o0OO00o0.C26536o0000oO;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.C26686o00ooo;
import o0OO00o0.C26689o0ooOoO;
import o0OO00o0.o000;
import o0OO00o0.o000000O;
import o0OO00o0.o00000O0;
import o0OO00o0.o0000OOO;
import o0OO00o0.o0Oo0oo;
import o0OO00o0.oo0o0Oo;
import o0OOOO0o.C27129OoooOOO;
import o0OOOoo.C27204OooO0O0;
import o0OOOoo.C27205OooO0OO;
import o0OOOoo0.C27212OooO;
import o0OOo0o.C27366OoooOoo;
import o0OOo0o.C27597o00ooo00;
import o0OOo0o.o00000O;
import o0OOooOo.C27972OooO00o;
import o0OOooOo.C27976OooO0o0;
import o0Oo0O0O.C28062OooOOOo;
import o0Ooo0oo.C29499o000;
import o0Ooo0oo.C29501o00000;
import o0Ooo0oo.C29502o000000;
import o0Ooo0oo.C29503o000000O;
import o0Ooo0oo.C29504o000000o;
import o0Ooo0oo.C29512o0000O;
import o0Ooo0oo.C29515o0000O0O;
import o0Ooo0oo.C29517o0000OO0;
import o0Ooo0oo.C29526o0000o0O;
import o0Ooo0oo.C29527o0000o0o;
import o0Ooo0oo.C29530o0000oOO;
import o0Ooo0oo.C29531o0000oOo;
import o0Ooo0oo.C29533o0000oo0;
import o0Ooo0oo.C29534o0000ooO;
import o0Ooo0oo.C29538o000O00O;
import o0Ooo0oo.C29540o000O0O0;
import o0Ooo0oo.C29542o000O0o;
import o0Ooo0oo.C29548o000OOo;
import o0Ooo0oo.C29550o000OoO;
import o0Ooo0oo.C29551o000Ooo;
import o0Ooo0oo.C29556o00o0O;
import o0Ooo0oo.C29557o00oO0O;
import o0Ooo0oo.C29558o00oO0o;
import o0Ooo0oo.C29560o0O0O00;
import o0Ooo0oo.C29561o0OO00O;
import o0Ooo0oo.C29562o0OOO0o;
import o0Ooo0oo.C29563o0Oo0oo;
import o0Ooo0oo.C29565o0ooOO0;
import o0Ooo0oo.C29567o0ooOoO;
import o0Ooo0oo.C29569oo0o0Oo;
import o0oo0Oo.C31253OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32466OooO0OO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33661OoooooO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.ThreadFactoryC33666o00000oO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0oO00.C33962Oooo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34458OooO0Oo;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.C34465OooOOo0;
import oOo00O0O.C34474OooOoo0;
import oOo00O0O.OooOO0O;
import ooOOoOO0.C35124OooOOOo;
import ooOOoOO0.C35143Oooo0o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/penbar/OooO0O0;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0O0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27366OoooOoo f75140OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26577o000oo0O f75141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C26435OoooO0O f75142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26433OoooO0 f75143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O f75144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27976OooO0o0 f75145OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0<AbstractC24338OooO0o0> f75146OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PenInfo f75147OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Set<Integer> f75148OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Integer> f75149OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Gson f75150OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Integer> f75151OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f75152OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f75153OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f75154OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f75155OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f75156OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f75157OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33781o00o0O f75158OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33781o00o0O f75159OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33769Ooooo0o f75160OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f75161OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33769Ooooo0o f75162OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33769Ooooo0o f75163OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f75164OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33769Ooooo0o f75165OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33769Ooooo0o f75166OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33769Ooooo0o f75167OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C33769Ooooo0o f75168Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33769Ooooo0o f75169Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33781o00o0O f75170Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33769Ooooo0o f75171Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33769Ooooo0o f75172Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C33769Ooooo0o f75173Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C33769Ooooo0o f75174Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C33769Ooooo0o f75175Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final C33769Ooooo0o f75176Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C33769Ooooo0o f75177Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C33769Ooooo0o f75178Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final AtomicBoolean f75179OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C33769Ooooo0o f75180OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C33769Ooooo0o f75181OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final C33769Ooooo0o f75182OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f75183OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final C33781o00o0O f75184OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f75185OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final C33772OooooOo f75186OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C33772OooooOo f75187OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C33769Ooooo0o f75188OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Integer> f75189Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final C33769Ooooo0o f75190Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final C33769Ooooo0o f75191OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final C33769Ooooo0o f75192OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final C33769Ooooo0o f75193OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final C33769Ooooo0o f75194Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final C33769Ooooo0o f75195Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final C33769Ooooo0o f75196OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final C33769Ooooo0o f75197Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C33769Ooooo0o f75198o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final C33769Ooooo0o f75199o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final C33769Ooooo0o f75200o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final C33661OoooooO f75201o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final C33898OooO0Oo f75202o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public PenVO f75203o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Integer> f75204o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final C33769Ooooo0o f75205ooOO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Boolean> f75139oo000o = C24340OooO0oo.OooO00o("show_favorites_toolbox");

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f75137o00oO0o = C24340OooO0oo.OooO0o0("favorites_pen_list");

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f75136o00oO0O = C24340OooO0oo.OooO0OO("favorites_toolbox_orientation");

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f75138o0ooOO0 = C24340OooO0oo.OooO0o0("favorites_toolbox_location_bias");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f75206OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f75207OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f75208OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f75209OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f75210OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f75211OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f75212OooOoo0;

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
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r0 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r1 = "XSMALL"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75207OooOo0o = r0
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r1 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r2 = "SMALL"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75206OooOo = r1
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r2 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r3 = "MEDIUM"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75209OooOoO0 = r2
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r3 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r4 = "LARGE"
                r5 = 3
                r3.<init>(r4, r5)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75208OooOoO = r3
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r4 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r5 = "XLARGE"
                r6 = 4
                r4.<init>(r5, r6)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75210OooOoOO = r4
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o r5 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o
                java.lang.String r6 = "XXLARGE"
                r7 = 5
                r5.<init>(r6, r7)
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75212OooOoo0 = r5
                com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO00o[] r0 = new com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o[]{r0, r1, r2, r3, r4, r5}
                com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.f75211OooOoo = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.noteeditor.penbar.OooO0O0.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f75211OooOoo.clone();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveEraserType$1", m80623f = "PenBarViewModel.kt", m80624l = {1297, 1310}, m80625m = "invokeSuspend")
    public static final class C19343OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75214OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f75215OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19343OooO0O0(String str, Continuation<? super C19343OooO0O0> continuation) {
            super(2, continuation);
            this.f75215OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new C19343OooO0O0(this.f75215OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19343OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r5.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r18) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75214OooOo0o;
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75214OooOo0o = 1;
                objOooO0o = OooO0O0.OooO0o(oooO0O0, this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            for (PenInfo penInfo : (Iterable) objOooO0o) {
                if (penInfo.getType() == 3) {
                    Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, this.f75215OooOoO0));
                    PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, bundleBundleOf, 190, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleBundleOf, 255, null);
                    this.f75214OooOo0o = 2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxVisibility$1", m80623f = "PenBarViewModel.kt", m80624l = {1615}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75217OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f75218OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxVisibility$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ boolean f75219OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f75220OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75219OooOo = z;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f75219OooOo, continuation);
                oooO00o.f75220OooOo0o = obj;
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
                ((C24334OooO0O0) this.f75220OooOo0o).OooO0oO(OooO0O0.f75139oo000o, Boolean.valueOf(this.f75219OooOo));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f75218OooOoO0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new OooO0OO(this.f75218OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75217OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooOO0<AbstractC24338OooO0o0> oooOO02 = OooO0O0.this.f75146OooOO0;
                OooO00o oooO00o = new OooO00o(this.f75218OooOoO0, null);
                this.f75217OooOo0o = 1;
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveLassoType$1", m80623f = "PenBarViewModel.kt", m80624l = {1319, 1333}, m80625m = "invokeSuspend")
    public static final class C23469OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75222OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f75223OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23469OooO0Oo(String str, Continuation<? super C23469OooO0Oo> continuation) {
            super(2, continuation);
            this.f75223OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new C23469OooO0Oo(this.f75223OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23469OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        
            if (r5.f75143OooO0o0.OooO0O0(new com.orion.notein.domain.models.note.PenInfo[]{r2}, r18) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75222OooOo0o;
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75222OooOo0o = 1;
                objOooO0o = OooO0O0.OooO0o(oooO0O0, this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            for (PenInfo penInfo : (Iterable) objOooO0o) {
                if (penInfo.getType() == 4) {
                    Bundle bundleDeepCopy = penInfo.getExtra().deepCopy();
                    bundleDeepCopy.putString(C18437z2.f56754h, this.f75223OooOoO0);
                    PenInfo penInfoCopy$default = penInfo.getNoteId() == null ? PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), false, bundleDeepCopy, 190, null) : PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleDeepCopy, 255, null);
                    this.f75222OooOo0o = 2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$setLassoColorActivatedState$1", m80623f = "PenBarViewModel.kt", m80624l = {1488}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75225OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f75226OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f75226OooOoO0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new OooO0o(this.f75226OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75225OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = OooO0O0.this.f75186OoooOo0;
                Boolean boolValueOf = Boolean.valueOf(this.f75226OooOoO0);
                this.f75225OooOo0o = 1;
                if (c33772OooooOo.emit(boolValueOf, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveSelectedPenType$1", m80623f = "PenBarViewModel.kt", m80624l = {EditingLanguage.CORSICAN, 1203}, m80625m = "invokeSuspend")
    public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75228OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f75229OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o0(int i, Continuation<? super OooO0o0> continuation) {
            super(2, continuation);
            this.f75229OooOoO0 = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new OooO0o0(this.f75229OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x01c1, code lost:
        
            if (r5.f75143OooO0o0.OooO0O0(r2, r24) == r1) goto L55;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO0o;
            Object next;
            Object next2;
            String str;
            PenInfo penInfoCopy$default;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75228OooOo0o;
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75228OooOo0o = 1;
                objOooO0o = OooO0O0.OooO0o(oooO0O0, this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HLRectDebug");
            List list = (List) objOooO0o;
            c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("saveSelectedPenType penList: ", OooOo.o000oOoO(list, null, null, null, new C27212OooO(1), 31)), new Object[0]);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PenInfo) next).getSelected()) {
                    break;
                }
            }
            PenInfo penInfo = (PenInfo) next;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((PenInfo) next2).getType() == this.f75229OooOoO0) {
                    break;
                }
            }
            PenInfo penInfo2 = (PenInfo) next2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("HLRectDebug");
            c20358OooO00o2.OooO0o0("saveSelectedPenType cur: " + penInfo + ", selected: " + penInfo2, new Object[0]);
            if (OooOOO0.OooO0O0(penInfo != null ? new Integer(penInfo.getType()) : null, penInfo2 != null ? new Integer(penInfo2.getType()) : null)) {
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0O0.f75147OooOO0O = penInfo;
            ArrayList arrayList = new ArrayList();
            C33769Ooooo0o c33769Ooooo0o = oooO0O0.f75162OooOoO0;
            if (penInfo != null) {
                Bundle bundleDeepCopy = penInfo.getExtra().deepCopy();
                bundleDeepCopy.putString("group_selected", TelemetryEventStrings.Value.FALSE);
                if (penInfo.getNoteId() == null) {
                    str = "group_selected";
                    penInfoCopy$default = PenInfo.copy$default(penInfo, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) c33769Ooooo0o.f121747OooOo0o.getValue(), false, bundleDeepCopy, 62, null);
                } else {
                    str = "group_selected";
                    penInfoCopy$default = PenInfo.copy$default(penInfo, null, 0, 0, 0, null, null, null, false, bundleDeepCopy, 127, null);
                }
                arrayList.add(penInfoCopy$default);
            } else {
                str = "group_selected";
            }
            if (penInfo2 != null) {
                Bundle bundleDeepCopy2 = penInfo2.getExtra().deepCopy();
                bundleDeepCopy2.putString(str, TelemetryEventStrings.Value.TRUE);
                arrayList.add(penInfo2.getNoteId() == null ? PenInfo.copy$default(penInfo2, C24761OooO.OooO00o("toString(...)"), 0, 0, 0, null, null, (String) c33769Ooooo0o.f121747OooOo0o.getValue(), true, bundleDeepCopy2, 62, null) : PenInfo.copy$default(penInfo2, null, 0, 0, 0, null, null, null, true, bundleDeepCopy2, 127, null));
            }
            c20358OooO00o2.OooOOO0("HLRectDebug");
            c20358OooO00o2.OooO0o0("saveSelectedPenType toUpdate: " + arrayList, new Object[0]);
            if (!arrayList.isEmpty()) {
                PenInfo[] penInfoArr = (PenInfo[]) arrayList.toArray(new PenInfo[0]);
                PenInfo[] penInfoArr2 = (PenInfo[]) Arrays.copyOf(penInfoArr, penInfoArr.length);
                this.f75228OooOo0o = 2;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$setNoteId$1", m80623f = "PenBarViewModel.kt", m80624l = {864, 866, 868}, m80625m = "invokeSuspend")
    public static final class C23470OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75231OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f75232OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f75233OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23470OooO0oO(String str, boolean z, Continuation<? super C23470OooO0oO> continuation) {
            super(2, continuation);
            this.f75233OooOoO0 = str;
            this.f75232OooOoO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new C23470OooO0oO(this.f75233OooOoO0, this.f75232OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23470OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ToolBoxInfo toolBoxInfo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75231OooOo0o;
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o00000O0 o00000o0OooO0Oo = oooO0O0.f75141OooO0Oo.OooO0Oo(App.f69564OoooOo0);
                this.f75231OooOo0o = 1;
                obj = C25252OooO0Oo.OooOOo(o00000o0OooO0Oo, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    toolBoxInfo = (ToolBoxInfo) obj;
                    if (toolBoxInfo == null) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                toolBoxInfo = (ToolBoxInfo) obj;
                if (toolBoxInfo == null) {
                    C33781o00o0O c33781o00o0O = oooO0O0.f75159OooOo0O;
                    Integer num = new Integer(toolBoxInfo.getPos());
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, num);
                    Integer num2 = new Integer(oooO0O0.f75148OooOO0o.contains(Integer.valueOf(toolBoxInfo.getPos())) ? 1 : 0);
                    C33781o00o0O c33781o00o0O2 = oooO0O0.f75158OooOo00;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, num2);
                } else if (this.f75232OooOoO) {
                    C33781o00o0O c33781o00o0O3 = oooO0O0.f75159OooOo0O;
                    Integer num3 = new Integer(6);
                    c33781o00o0O3.getClass();
                    c33781o00o0O3.OooOO0(null, num3);
                    Integer num4 = new Integer(1);
                    C33781o00o0O c33781o00o0O4 = oooO0O0.f75158OooOo00;
                    c33781o00o0O4.getClass();
                    c33781o00o0O4.OooOO0(null, num4);
                } else {
                    C33781o00o0O c33781o00o0O5 = oooO0O0.f75159OooOo0O;
                    Integer num5 = new Integer(1);
                    c33781o00o0O5.getClass();
                    c33781o00o0O5.OooOO0(null, num5);
                    Integer num6 = new Integer(0);
                    C33781o00o0O c33781o00o0O6 = oooO0O0.f75158OooOo00;
                    c33781o00o0O6.getClass();
                    c33781o00o0O6.OooOO0(null, num6);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                C26435OoooO0O c26435OoooO0O = oooO0O0.f75142OooO0o;
                this.f75231OooOo0o = 2;
                obj = c26435OoooO0O.f90799OooO0O0.toToolBoxInfo(c26435OoooO0O.f90798OooO00o.OooO0O0("global-toolbox"));
            } else {
                C26435OoooO0O c26435OoooO0O2 = oooO0O0.f75142OooO0o;
                this.f75231OooOo0o = 3;
                obj = c26435OoooO0O2.f90799OooO0O0.toToolBoxInfo(c26435OoooO0O2.f90798OooO00o.OooO0O0(this.f75233OooOoO0));
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.OooO0O0$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updatePenInfoByPenEvent$1", m80623f = "PenBarViewModel.kt", m80624l = {980, 982, 983, 991}, m80625m = "invokeSuspend")
    public static final class C23471OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooO0O0 f75234OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f75235OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f75237OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<Integer> f75238OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f75239OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23471OooO0oo(AbstractC24338OooO0o0.OooO00o<Integer> oooO00o, oO0O000o.OooO00o<C32460OooOooO> oooO00o2, Continuation<? super C23471OooO0oo> continuation) {
            super(2, continuation);
            this.f75238OooOoOO = oooO00o;
            this.f75239OooOoo0 = oooO00o2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0O0.this.new C23471OooO0oo(this.f75238OooOoOO, this.f75239OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23471OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0022, PHI: r2 r5
          0x0074: PHI (r2v8 o0OOOoo.OooO0O0) = (r2v7 o0OOOoo.OooO0O0), (r2v20 o0OOOoo.OooO0O0) binds: [B:27:0x0071, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0074: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v6 java.lang.Object) binds: [B:27:0x0071, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:42:0x00ce, B:16:0x0031, B:29:0x0074, B:30:0x007e, B:32:0x0084, B:36:0x0093, B:38:0x0098, B:17:0x0037, B:26:0x0067, B:23:0x0050), top: B:47:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:42:0x00ce, B:16:0x0031, B:29:0x0074, B:30:0x007e, B:32:0x0084, B:36:0x0093, B:38:0x0098, B:17:0x0037, B:26:0x0067, B:23:0x0050), top: B:47:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:42:0x00ce, B:16:0x0031, B:29:0x0074, B:30:0x007e, B:32:0x0084, B:36:0x0093, B:38:0x0098, B:17:0x0037, B:26:0x0067, B:23:0x0050), top: B:47:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0092 A[SYNTHETIC] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOooO0o;
            C27204OooO0O0 c27204OooO0O0;
            Object objOooO0o2;
            Iterator it;
            Object next;
            PenInfo penInfo;
            OooO0O0 oooO0O0;
            PenInfo penInfo2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75237OooOoO0;
            OooO0O0 oooO0O02 = OooO0O0.this;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33898OooO0Oo c33898OooO0Oo = oooO0O02.f75202o00o0O;
                    this.f75237OooOoO0 = 1;
                    if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i == 2) {
                        C32446OooOOOo.OooO0O0(obj);
                        objOooO0o = obj;
                        c27204OooO0O0 = (C27204OooO0O0) objOooO0o;
                        this.f75235OooOo0o = c27204OooO0O0;
                        this.f75237OooOoO0 = 3;
                        objOooO0o2 = OooO0O0.OooO0o(oooO0O02, this);
                        if (objOooO0o2 == enumC32485OooO00o) {
                            List list = (List) objOooO0o2;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            penInfo = (PenInfo) next;
                            if (penInfo != null) {
                            }
                            oooO0O02.f75202o00o0O.OooOOO0(null);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        return enumC32485OooO00o;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oooO0O0 = this.f75234OooOo;
                        penInfo2 = (PenInfo) this.f75235OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        oooO0O0.f75147OooOO0O = penInfo2;
                        oooO0O02.f75202o00o0O.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    c27204OooO0O0 = (C27204OooO0O0) this.f75235OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o2 = obj;
                    List list2 = (List) objOooO0o2;
                    it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((PenInfo) next).getSelected()) {
                            break;
                        }
                    }
                    penInfo = (PenInfo) next;
                    if (penInfo != null) {
                        AbstractC24338OooO0o0.OooO00o<Integer> oooO00o = this.f75238OooOoOO;
                        oO0O000o.OooO00o<C32460OooOooO> oooO00o2 = this.f75239OooOoo0;
                        OooO0O0.OooO0oO(oooO0O02, c27204OooO0O0.f95000OooO0O0);
                        C27976OooO0o0 c27976OooO0o0 = oooO0O02.f75145OooO0oo;
                        PenInfo penInfo3 = oooO0O02.f75147OooOO0O;
                        String str = (String) oooO0O02.f75162OooOoO0.f121747OooOo0o.getValue();
                        this.f75235OooOo0o = penInfo;
                        this.f75234OooOo = oooO0O02;
                        this.f75237OooOoO0 = 4;
                        c27976OooO0o0.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27972OooO00o(c27976OooO0o0, oooO00o, penInfo, penInfo3, list2, oooO00o2, str, null), this) != enumC32485OooO00o) {
                            oooO0O0 = oooO0O02;
                            penInfo2 = penInfo;
                            oooO0O0.f75147OooOO0O = penInfo2;
                        }
                        return enumC32485OooO00o;
                    }
                    oooO0O02.f75202o00o0O.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0.OooO00o<Integer> oooO00o3 = this.f75238OooOoOO;
                this.f75237OooOoO0 = 2;
                oooO0O02.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29561o0OO00O(oooO0O02, oooO00o3, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    c27204OooO0O0 = (C27204OooO0O0) objOooO0o;
                    this.f75235OooOo0o = c27204OooO0O0;
                    this.f75237OooOoO0 = 3;
                    objOooO0o2 = OooO0O0.OooO0o(oooO0O02, this);
                    if (objOooO0o2 == enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th) {
                oooO0O02.f75202o00o0O.OooOOO0(null);
                throw th;
            }
        }
    }

    public OooO0O0(C26577o000oo0O c26577o000oo0O, C26433OoooO0 c26433OoooO0, C26435OoooO0O c26435OoooO0O, C27129OoooOOO c27129OoooOOO, o00000O getRemoteConfigUseCase, C27976OooO0o0 updatePenInfoUseCase, C27366OoooOoo colorSetUseCase, C27597o00ooo00 vipFeatureUseCase, OooOO0 penBoxDataStore) {
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        OooOOO0.OooO0oO(updatePenInfoUseCase, "updatePenInfoUseCase");
        OooOOO0.OooO0oO(colorSetUseCase, "colorSetUseCase");
        OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        OooOOO0.OooO0oO(penBoxDataStore, "penBoxDataStore");
        this.f75141OooO0Oo = c26577o000oo0O;
        this.f75143OooO0o0 = c26433OoooO0;
        this.f75142OooO0o = c26435OoooO0O;
        this.f75144OooO0oO = getRemoteConfigUseCase;
        this.f75145OooO0oo = updatePenInfoUseCase;
        this.f75140OooO = colorSetUseCase;
        this.f75146OooOO0 = penBoxDataStore;
        this.f75148OooOO0o = OooOOO.OoooOo0(new Integer[]{0, 2, 4, 6, 8});
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new BundleTypeAdapterFactory()).create();
        OooOOO0.OooO0o(gsonCreate, "create(...)");
        this.f75150OooOOO0 = gsonCreate;
        InterfaceC33721OooO0o<Integer> interfaceC33721OooO0oOooO0o0 = vipFeatureUseCase.OooO0o0(20);
        this.f75149OooOOO = interfaceC33721OooO0oOooO0o0;
        this.f75151OooOOOO = vipFeatureUseCase.OooO0o0(11);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(0);
        this.f75152OooOOOo = c33781o00o0OOooO00o;
        this.f75154OooOOo0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(null);
        this.f75153OooOOo = c33781o00o0OOooO00o2;
        this.f75155OooOOoo = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o2);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(null);
        this.f75158OooOo00 = c33781o00o0OOooO00o3;
        this.f75157OooOo0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o3);
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f75159OooOo0O = c33781o00o0OOooO00o4;
        this.f75160OooOo0o = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o4);
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(null);
        this.f75156OooOo = c33781o00o0OOooO00o5;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o5, c26577o000oo0O.OooO0Oo(App.f69564OoooOo0), new C29556o00o0O(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "global-toolbox");
        this.f75162OooOoO0 = c33769Ooooo0oOooOoO0;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C29526o0000o0O(this, null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, c34434OooOoO);
        this.f75161OooOoO = c33769Ooooo0oOooOoO02;
        AbstractC24338OooO0o0.OooO00o<Boolean> key = App.f69559OoooO00;
        OooOOO0.OooO0oO(key, "key");
        OooOO0<AbstractC24338OooO0o0> oooOO02 = c26577o000oo0O.f91598OooO00o;
        C26533o0000o0 c26533o0000o0 = new C26533o0000o0(oooOO02.getData(), key);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool = Boolean.TRUE;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(c26533o0000o0, interfaceC33636Oooo00oOooO00o2, c33779o00Oo0OooO00o2, bool);
        this.f75163OooOoOO = c33769Ooooo0oOooOoO03;
        AbstractC24338OooO0o0.OooO00o<Float> key2 = App.f69558OoooO0;
        OooOOO0.OooO0oO(key2, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(new C26534o0000o0O(oooOO02.getData(), key2), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Float.valueOf(0.0f));
        this.f75165OooOoo0 = c33769Ooooo0oOooOoO04;
        AbstractC24338OooO0o0.OooO00o<Boolean> key3 = App.f69560OoooO0O;
        OooOOO0.OooO0oO(key3, "key");
        o000000O o000000o2 = new o000000O(oooOO02.getData(), key3, 0);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o3 = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o3 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        Boolean bool2 = Boolean.FALSE;
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(o000000o2, interfaceC33636Oooo00oOooO00o3, c33779o00Oo0OooO00o3, bool2);
        this.f75164OooOoo = c33769Ooooo0oOooOoO05;
        AbstractC24338OooO0o0.OooO00o<Boolean> key4 = App.f69557OoooO;
        OooOOO0.OooO0oO(key4, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO06 = C25252OooO0Oo.OooOoO0(new o000000O(oooOO02.getData(), key4, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f75166OooOooO = c33769Ooooo0oOooOoO06;
        this.f75167OooOooo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO05, c33769Ooooo0oOooOoO06, new C29562o0OOO0o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        AbstractC24338OooO0o0.OooO00o<Boolean> key5 = App.f69561OoooOO0;
        OooOOO0.OooO0oO(key5, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO07 = C25252OooO0Oo.OooOoO0(new o000(oooOO02.getData(), key5), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        C33781o00o0O c33781o00o0OOooO00o6 = C33784o00ooo.OooO00o(bool2);
        this.f75170Oooo000 = c33781o00o0OOooO00o6;
        C33769Ooooo0o c33769Ooooo0oOooOoO08 = C25252OooO0Oo.OooOoO0(C28062OooOOOo.OooO00o(c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO03, c33769Ooooo0oOooOoO05, c33769Ooooo0oOooOoO06, c33769Ooooo0oOooOoO04, c33769Ooooo0oOooOoO07, c33781o00o0OOooO00o6, new C29504o000000o(null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75171Oooo00O = c33769Ooooo0oOooOoO08;
        this.f75172Oooo00o = C25252OooO0Oo.OooOoO0(new C29527o0000o0o(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75169Oooo0 = C25252OooO0Oo.OooOoO0(new C29530o0000oOO(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75173Oooo0O0 = C25252OooO0Oo.OooOoO0(new C29531o0000oOo(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO09 = C25252OooO0Oo.OooOoO0(new C29533o0000oo0(c33769Ooooo0oOooOoO08), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75174Oooo0OO = c33769Ooooo0oOooOoO09;
        this.f75176Oooo0o0 = C25252OooO0Oo.OooOoO0(new C29534o0000ooO(c33769Ooooo0oOooOoO09), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO010 = C25252OooO0Oo.OooOoO0(new C29499o000(c33769Ooooo0oOooOoO09), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f75175Oooo0o = c33769Ooooo0oOooOoO010;
        C33769Ooooo0o c33769Ooooo0oOooOoO011 = C25252OooO0Oo.OooOoO0(new C29550o000OoO(c33769Ooooo0oOooOoO09, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new C32443OooOOO(bool2, null));
        this.f75177Oooo0oO = c33769Ooooo0oOooOoO011;
        this.f75178Oooo0oo = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO010, c33769Ooooo0oOooOoO011, new C29569oo0o0Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        C33769Ooooo0o c33769Ooooo0oOooOoO012 = C25252OooO0Oo.OooOoO0(new C29542o000O0o(c33769Ooooo0oOooOoO09), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f75168Oooo = c33769Ooooo0oOooOoO012;
        this.f75181OoooO00 = C25252OooO0Oo.OooOoO0(new C29551o000Ooo(c33769Ooooo0oOooOoO012), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key6 = App.f69578o000000O;
        OooOOO0.OooO0oO(key6, "key");
        C26689o0ooOoO c26689o0ooOoO = new C26689o0ooOoO(oooOO02.getData(), key6, 0);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o4 = o0OoOo0.OooO00o(this);
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO013 = C25252OooO0Oo.OooOoO0(c26689o0ooOoO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o4, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f75180OoooO0 = c33769Ooooo0oOooOoO013;
        AbstractC24338OooO0o0.OooO00o<Float> key7 = App.f69579o000000o;
        OooOOO0.OooO0oO(key7, "key");
        C33769Ooooo0o c33769Ooooo0oOooOoO014 = C25252OooO0Oo.OooOoO0(new C26536o0000oO(oooOO02.getData(), key7), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Float.valueOf(0.2f));
        this.f75182OoooO0O = c33769Ooooo0oOooOoO014;
        this.f75179OoooO = new AtomicBoolean(false);
        C33769Ooooo0o c33769Ooooo0oOooOoO015 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO013, c33769Ooooo0oOooOoO014, new C29548o000OOo(this, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f75183OoooOO0 = c33769Ooooo0oOooOoO015;
        C33769Ooooo0o c33769Ooooo0oOooOoO016 = C25252OooO0Oo.OooOoO0(new o0Oo0oo(penBoxDataStore.getData(), this, 1), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75198o000oOoO = c33769Ooooo0oOooOoO016;
        C33781o00o0O c33781o00o0OOooO00o7 = C33784o00ooo.OooO00o(new C32443OooOOO(bool2, 0));
        this.f75184OoooOOO = c33781o00o0OOooO00o7;
        this.f75185OoooOOo = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o7);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f75186OoooOo0 = c33772OooooOoOooO0O0;
        this.f75187OoooOoO = c33772OooooOoOooO0O0;
        C33769Ooooo0o c33769Ooooo0oOooOoO017 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o7, new C29502o000000(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75188OoooOoo = c33769Ooooo0oOooOoO017;
        C33769Ooooo0o c33769Ooooo0oOooOoO018 = C25252OooO0Oo.OooOoO0(colorSetUseCase.OooO00o(0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        InterfaceC33721OooO0o<Integer> interfaceC33721OooO0oOooO0o02 = vipFeatureUseCase.OooO0o0(46);
        this.f75189Ooooo00 = interfaceC33721OooO0oOooO0o02;
        C33769Ooooo0o c33769Ooooo0oOooOoO019 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO018, interfaceC33721OooO0oOooO0o0, interfaceC33721OooO0oOooO0o02, new C29557o00oO0O(4, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75190Ooooo0o = c33769Ooooo0oOooOoO019;
        AbstractC24338OooO0o0.OooO00o<Boolean> key8 = App.f69546Oooo;
        OooOOO0.OooO0oO(key8, "key");
        this.f75191OooooO0 = C25252OooO0Oo.OooOoO0(new o0000OOO(oooOO02.getData(), key8), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        AbstractC24338OooO0o0.OooO00o<Boolean> key9 = App.f69567Ooooo00;
        OooOOO0.OooO0oO(key9, "key");
        this.f75192OooooOO = C25252OooO0Oo.OooOoO0(new C26535o0000o0o(oooOO02.getData(), key9), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
        this.f75193OooooOo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo(new C29501o00000(this, null), c33769Ooooo0oOooOoO02), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f75195Oooooo0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo(new C29565o0ooOO0(2, null), c33769Ooooo0oOooOoO02), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), DrawToolFactory.LASSO_TYPE_FREE);
        this.f75194Oooooo = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo(new C29503o000000O(2, null), c33769Ooooo0oOooOoO02), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f75196OoooooO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(new C33770OooooO0(new C26428Oooo0OO(2, null)), c33769Ooooo0oOooOoO02, new C29560o0O0O00(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO020 = C25252OooO0Oo.OooOoO0(new oo0o0Oo(penBoxDataStore.getData(), this, 1), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f75197Ooooooo = c33769Ooooo0oOooOoO020;
        InterfaceC33721OooO0o<Integer> interfaceC33721OooO0oOooO0o03 = vipFeatureUseCase.OooO0o0(10);
        this.f75204o0OoOo0 = interfaceC33721OooO0oOooO0o03;
        this.f75205ooOO = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO020, c33769Ooooo0oOooOoO016, interfaceC33721OooO0oOooO0o03, c33769Ooooo0oOooOoO015, new C29563o0Oo0oo(5, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        AbstractC24338OooO0o0.OooO00o<Boolean> key10 = App.f69591o00oO0O;
        OooOOO0.OooO0oO(key10, "key");
        this.f75199o00O0O = C25252OooO0Oo.OooOoO0(new o0Oo0oo(oooOO02.getData(), key10, 0), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        this.f75200o00Oo0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO019, c33769Ooooo0oOooOoO017, new C29558o00oO0o(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool2);
        new AtomicInteger();
        this.f75201o00Ooo = new C33661OoooooO(Executors.newScheduledThreadPool(1, new ThreadFactoryC33666o00000oO()));
        this.f75202o00o0O = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OooO0o(OooO0O0 oooO0O0, Continuation continuation) {
        return oooO0O0.f75143OooO0o0.OooO00o((String) oooO0O0.f75162OooOoO0.f121747OooOo0o.getValue(), continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:11)(2:12|13))(2:14|(2:16|17)(2:18|(2:20|(2:22|23)(2:24|(1:26)))(3:92|93|94)))|27|96|28|(3:30|(1:32)(1:33)|(3:35|(4:38|(3:100|40|103)(1:102)|101|36)|99)(2:43|44))|46|(1:48)|(1:53)(1:52)|54|95|55|(3:57|(1:59)(1:60)|(4:62|(8:65|97|66|(2:70|(1:75)(1:74))(0)|(1:81)(1:78)|(3:105|83|108)(1:107)|106|63)|104|84)(2:85|86))|88|(1:90)|91|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r7 = oOO00oo.C34406OooO00o.f123390OooO00o;
        r7.OooOOO0("PenBarViewModel");
        r7.OooO0Oo(r3, "Failed to parse incompatible device models, ignoring.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019a, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
    
        r0 = oOO00oo.C34406OooO00o.f123390OooO00o;
        r0.OooOOO0("PenBarViewModel");
        r0.OooO0Oo(r12, "Failed to parse tool-mapping configs, ignoring.", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(OooO0O0 oooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29567o0ooOoO c29567o0ooOoO;
        Long lValueOf;
        Integer numValueOf;
        oooO0O0.getClass();
        if (abstractC32479OooO0OO instanceof C29567o0ooOoO) {
            c29567o0ooOoO = (C29567o0ooOoO) abstractC32479OooO0OO;
            int i = c29567o0ooOoO.f104884OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29567o0ooOoO.f104884OooOoO = i - Integer.MIN_VALUE;
            } else {
                c29567o0ooOoO = new C29567o0ooOoO(oooO0O0, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c29567o0ooOoO.f104882OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29567o0ooOoO.f104884OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            AtomicBoolean atomicBoolean = oooO0O0.f75179OoooO;
            if (atomicBoolean.get()) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (!atomicBoolean.compareAndSet(false, true)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PenBarViewModel");
                c20358OooO00o.OooOO0("Tool-mapping configs already loaded, skip.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            if (Build.VERSION.SDK_INT < 34) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PenBarViewModel");
                c20358OooO00o2.OooO0o0("Skipping tool-mapping configs loading on Android < 14", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95022OooOo0O;
            c29567o0ooOoO.f104883OooOo0o = oooO0O0;
            c29567o0ooOoO.f104884OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(new C26686o00ooo(oooO0O0.f75141OooO0Oo.f91598OooO00o.getData(), oooO00o), c29567o0ooOoO);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0O0 = c29567o0ooOoO.f104883OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        boolean zBooleanValue = ((Boolean) objOooOOo).booleanValue();
        HashSet hashSet = new HashSet();
        String valueAsString = oooO0O0.f75144OooO0oO.f95374OooO00o.getValueAsString("rconfig_ink_api_incompatible_device_models");
        if (!C33599OooOo0O.Oooo0o0(valueAsString)) {
            AbstractC34457OooO0OO.OooO00o oooO00o2 = AbstractC34457OooO0OO.f123490OooO0Oo;
            oooO00o2.getClass();
            OooOO0O oooOO0O = (OooOO0O) oooO00o2.OooO0O0(valueAsString, C34465OooOOo0.f123523OooO00o);
            C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
            OooOOO0.OooO0oO(oooOO0O, "<this>");
            C34458OooO0Oo c34458OooO0Oo = oooOO0O instanceof C34458OooO0Oo ? (C34458OooO0Oo) oooOO0O : null;
            if (c34458OooO0Oo == null) {
                C34462OooOO0o.OooO00o(oooOO0O, "JsonArray");
                throw null;
            }
            Iterator<OooOO0O> it = c34458OooO0Oo.f123494OooOo0o.iterator();
            while (it.hasNext()) {
                String strOooO0O0 = C34462OooOO0o.OooO0OO(it.next()).OooO0O0();
                if (!C33599OooOo0O.Oooo0o0(strOooO0O0)) {
                    hashSet.add(strOooO0O0);
                }
            }
        }
        String str = Build.MODEL;
        boolean z = (zBooleanValue || hashSet.contains(str != null ? C33595OooOOo.OooOo0O(str, " ", "") : "")) ? false : true;
        Object objOooOO0o = C34436OooOoOO.f123455OooOo0o;
        String valueAsString2 = oooO0O0.f75144OooO0oO.f95374OooO00o.getValueAsString("rconfig_ink_tool_mapping_configs");
        if (!C33599OooOo0O.Oooo0o0(valueAsString2)) {
            AbstractC34457OooO0OO.OooO00o oooO00o3 = AbstractC34457OooO0OO.f123490OooO0Oo;
            oooO00o3.getClass();
            OooOO0O oooOO0O2 = (OooOO0O) oooO00o3.OooO0O0(valueAsString2, C34465OooOOo0.f123523OooO00o);
            C33962Oooo c33962Oooo2 = C34462OooOO0o.f123521OooO00o;
            OooOOO0.OooO0oO(oooOO0O2, "<this>");
            C34474OooOoo0 c34474OooOoo0 = oooOO0O2 instanceof C34474OooOoo0 ? (C34474OooOoo0) oooOO0O2 : null;
            if (c34474OooOoo0 == null) {
                C34462OooOO0o.OooO00o(oooOO0O2, "JsonObject");
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, OooOO0O> entry : c34474OooOoo0.f123538OooOo0o.entrySet()) {
                String key = entry.getKey();
                OooOO0O value = entry.getValue();
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0(key);
                try {
                    lValueOf = Long.valueOf(new C35143Oooo0o0(C34462OooOO0o.OooO0OO(value).OooO0O0()).OooO());
                } catch (C35124OooOOOo unused) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    numValueOf = (-2147483648L > jLongValue || jLongValue > 2147483647L) ? null : Integer.valueOf((int) jLongValue);
                }
                C32443OooOOO c32443OooOOO = (numOooOOO0 == null || numValueOf == null) ? null : new C32443OooOOO(numOooOOO0, numValueOf);
                if (c32443OooOOO != null) {
                    arrayList.add(c32443OooOOO);
                }
            }
            objOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("PenBarViewModel");
        c20358OooO00o3.OooO0o0("Tool mapping: enableInkPen=" + z + ", rules=" + objOooOO0o, new Object[0]);
        C32466OooO0OO c32466OooO0OO = C31253OooOOOo.f111547OooO00o;
        C32466OooO0OO c32466OooO0OO2 = new C32466OooO0OO();
        c32466OooO0OO2.putAll(C31253OooOOOo.f111547OooO00o);
        c32466OooO0OO2.putAll(objOooOO0o);
        if (!z) {
            c32466OooO0OO2.put(10, 10);
            c32466OooO0OO2.put(12, 12);
            c32466OooO0OO2.put(0, 0);
            c32466OooO0OO2.put(1, 1);
        }
        C32466OooO0OO c32466OooO0OOOooO0O0 = c32466OooO0OO2.OooO0O0();
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = C31253OooOOOo.f111549OooO0OO;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(c32466OooO0OOOooO0O0);
        c20358OooO00o3.OooOOO0("PenToolContract");
        c20358OooO00o3.OooO0o0("Pen-Tool mappings updated. useInkPen=" + z + ", custom rules=" + objOooOO0o, new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }

    public static final void OooO0oO(OooO0O0 oooO0O0, int i) {
        C25895OooO00o c25895OooO00o;
        oooO0O0.getClass();
        String MANUFACTURER = Build.MANUFACTURER;
        OooOOO0.OooO0o(MANUFACTURER, "MANUFACTURER");
        Locale locale = Locale.ROOT;
        String lowerCase = MANUFACTURER.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String lowerCase2 = BRAND.toLowerCase(locale);
        OooOOO0.OooO0o(lowerCase2, "toLowerCase(...)");
        boolean zIsFunctionVibrationEnable = false;
        if ((C33599OooOo0O.OooOoOO(lowerCase, "oppo", false) || C33599OooOo0O.OooOoOO(lowerCase, "oneplus", false) || C33599OooOo0O.OooOoOO(lowerCase2, "oppo", false) || C33599OooOo0O.OooOoOO(lowerCase2, "oneplus", false)) && i != 0 && (c25895OooO00o = C25895OooO00o.f88411OooO0Oo) != null && c25895OooO00o.OooO00o().contains(IpeFeature.FUNCTION_VIBRATION)) {
            Log.d("PencilManager", "isFunctionFeedbackEnable");
            ISdkAidlInterface iSdkAidlInterface = c25895OooO00o.f88412OooO00o;
            if (iSdkAidlInterface == null) {
                Log.e("PencilManager", "isFunctionFeedbackEnable error, interface is null");
            } else {
                try {
                    zIsFunctionVibrationEnable = iSdkAidlInterface.isFunctionVibrationEnable();
                } catch (RemoteException e) {
                    Log.e("PencilManager", "isFunctionFeedbackEnable error = ".concat(String.valueOf(e)));
                }
            }
            if (zIsFunctionVibrationEnable) {
                o0O0OoO0.OooO0o oooO0o = o0O0OoO0.OooO0o.f88419OooOoO;
                if (c25895OooO00o.f88412OooO00o == null) {
                    Log.e("PencilManager", "mInterface is null!");
                    return;
                }
                Log.d("PencilManager", "startVibration ".concat(String.valueOf(oooO0o)));
                try {
                    c25895OooO00o.f88412OooO00o.startVibration(4);
                } catch (RemoteException e2) {
                    Log.e("PencilManager", "startVibration, error = ".concat(String.valueOf(e2)));
                }
            }
        }
    }

    public final void OooO(int i) {
        if (i >= 0 && i < 8) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29517o0000OO0(this, i, null), 2);
        }
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f75159OooOo0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
        Integer numValueOf2 = Integer.valueOf(this.f75148OooOO0o.contains(Integer.valueOf(i)) ? 1 : 0);
        C33781o00o0O c33781o00o0O2 = this.f75158OooOo00;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, numValueOf2);
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        try {
            this.f75201o00Ooo.close();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(e, C24684Oooo.OooO0O0(c20358OooO00o, "NoteEditorContainerViewModel", "penInfoContext close error: ", e), new Object[0]);
        }
    }

    public final void OooO0oo(int i) {
        C33781o00o0O c33781o00o0O = this.f75152OooOOOo;
        Integer numValueOf = Integer.valueOf(i | ((Number) c33781o00o0O.getValue()).intValue());
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    public final void OooOO0(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C33781o00o0O c33781o00o0O = this.f75158OooOo00;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, numValueOf);
    }

    public final void OooOO0O(String str) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C19343OooO0O0(str, null), 2);
    }

    public final void OooOO0o(boolean z) {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0OO(z, null), 2);
    }

    public final Object OooOOO(PenVO penVO, boolean z, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29515o0000O0O(penVO, this, z, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOOO0(String type) {
        OooOOO0.OooO0oO(type, "type");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23469OooO0Oo(type, null), 2);
    }

    public final void OooOOOO(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "HLRectDebug", "saveSelectedPenType type: ", i), new Object[0]);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0o0(i, null), 2);
    }

    public final Object OooOOOo(PenWidthVO penWidthVO, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29512o0000O(this, penWidthVO, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOOo(String noteId, boolean z) {
        OooOOO0.OooO0oO(noteId, "noteId");
        if (noteId.length() == 0) {
            return;
        }
        C33781o00o0O c33781o00o0O = this.f75156OooOo;
        if (OooOOO0.OooO0O0((String) c33781o00o0O.getValue(), noteId)) {
            return;
        }
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, noteId);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23470OooO0oO(noteId, z, null), 2);
    }

    public final void OooOOo0(boolean z, Integer num) {
        C32443OooOOO c32443OooOOO = new C32443OooOOO(Boolean.valueOf(z), num);
        C33781o00o0O c33781o00o0O = this.f75184OoooOOO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c32443OooOOO);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO0o(z, null), 3);
    }

    public final Object OooOOoo(int i, int i2, int i3, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29538o000O00O(i2, this, i3, i, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOo0(int i, int i2, float f, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29540o000O0O0(this, i2, i, f, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooOo00(AbstractC24338OooO0o0.OooO00o<Integer> key, oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        OooOOO0.OooO0oO(key, "key");
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), this.f75201o00Ooo, null, new C23471OooO0oo(key, oooO00o, null), 2);
    }
}
