package androidx.fragment.app;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20418OooOoo;
import OooO0o.AbstractC20425OooO0o0;
import OooO0o.C20424OooO0Oo;
import OooO0o.C20427OooO0oo;
import OooO0oO.AbstractC20431OooO00o;
import OooO0oO.C20435OooO0o;
import OooO0oO.C20439OooO0oo;
import OooOoo.C20593OooO0Oo;
import Oooo0OO.RunnableC20958OooOOO;
import Oooo0oO.C21111o0ooOoO;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.AbstractC21907Oooo;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.fragment.app.C21905OooOooO;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.global.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0OO;
import o0OoO0OO.C28617OooOOOo;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f64799OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<Fragment> f64803OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C20418OooOoo f64804OooO0oO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC21900OooOoO<?> f64816OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Fragment f64821OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC21899OooOo0o f64822OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Fragment f64823OooOoOO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C20427OooO0oo f64827OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ArrayList<Fragment> f64828Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f64829Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C20427OooO0oo f64830Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C20427OooO0oo f64831Oooo00O;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f64833Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f64834Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f64835Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f64836Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f64837Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ArrayList<Boolean> f64838Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public C21911Oooo0OO f64840OoooO00;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooOOOO> f64798OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C21915Oooo0oo f64800OooO0OO = new C21915Oooo0oo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f64801OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LayoutInflaterFactory2C21903OooOoo f64802OooO0o = new LayoutInflaterFactory2C21903OooOoo(this);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public androidx.fragment.app.OooO00o f64805OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f64797OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f64806OooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicInteger f64807OooOO0O = new AtomicInteger();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<String, BackStackState> f64808OooOO0o = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Map<String, Bundle> f64810OooOOO0 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Map<String, OooOOO0> f64809OooOOO = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<OooOOO> f64811OooOOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C21905OooOooO f64812OooOOOo = new C21905OooOooO(this);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final CopyOnWriteArrayList<InterfaceC21913Oooo0o0> f64814OooOOo0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C21906OooOooo f64813OooOOo = new Consumer() { // from class: androidx.fragment.app.OooOooo
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = this.f65004OooOo0o;
            if (fragmentManager.Oooo0oo()) {
                fragmentManager.OooO(false, configuration);
            }
        }
    };

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Oooo000 f64815OooOOoo = new Consumer() { // from class: androidx.fragment.app.Oooo000
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.f65034OooOo0o;
            if (fragmentManager.Oooo0oo() && num.intValue() == 80) {
                fragmentManager.OooOOO0(false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C21908Oooo00O f64818OooOo00 = new Consumer() { // from class: androidx.fragment.app.Oooo00O
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
            FragmentManager fragmentManager = this.f65035OooOo0o;
            if (fragmentManager.Oooo0oo()) {
                fragmentManager.OooOOO(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C21909Oooo00o f64817OooOo0 = new Consumer() { // from class: androidx.fragment.app.Oooo00o
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
            FragmentManager fragmentManager = this.f65036OooOo0o;
            if (fragmentManager.Oooo0oo()) {
                fragmentManager.OooOOoo(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooO0OO f64819OooOo0O = new OooO0OO();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f64820OooOo0o = -1;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C28617OooOOOo f64825OooOoo0 = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C21876OooO0Oo f64824OooOoo = new C21876OooO0Oo();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C21877OooO0o0 f64826OooOooO = new C21877OooO0o0();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f64832Oooo00o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final OooO0o f64839OoooO0 = new OooO0o();

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f64841OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f64842OooOo0o;

        public class OooO00o implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.f64842OooOo0o = parcel.readString();
                launchedFragmentInfo.f64841OooOo = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f64842OooOo0o = str;
            this.f64841OooOo = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f64842OooOo0o);
            parcel.writeInt(this.f64841OooOo);
        }
    }

    public class OooO implements OooO0o.OooO00o<ActivityResult> {
        public OooO() {
        }

        @Override // OooO0o.OooO00o
        public final void OooO0O0(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollLast = fragmentManager.f64832Oooo00o.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            C21915Oooo0oo c21915Oooo0oo = fragmentManager.f64800OooO0OO;
            String str = launchedFragmentInfoPollLast.f64842OooOo0o;
            Fragment fragmentOooO0OO = c21915Oooo0oo.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onActivityResult(launchedFragmentInfoPollLast.f64841OooOo, activityResult2.f62240OooOo0o, activityResult2.f62239OooOo);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    public class OooO00o implements OooO0o.OooO00o<Map<String, Boolean>> {
        public OooO00o() {
        }

        @Override // OooO0o.OooO00o
        public final void OooO0O0(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f64832Oooo00o.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            C21915Oooo0oo c21915Oooo0oo = fragmentManager.f64800OooO0OO;
            String str = launchedFragmentInfoPollFirst.f64842OooOo0o;
            Fragment fragmentOooO0OO = c21915Oooo0oo.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onRequestPermissionsResult(launchedFragmentInfoPollFirst.f64841OooOo, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class OooO0O0 extends AbstractC20413OooOo0O {
        public OooO0O0() {
            super(false);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackCancelled() {
            boolean zOooo0o = FragmentManager.Oooo0o(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zOooo0o) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (FragmentManager.Oooo0o(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.f64805OooO0oo);
            }
            androidx.fragment.app.OooO00o oooO00o = fragmentManager.f64805OooO0oo;
            if (oooO00o != null) {
                oooO00o.f64904OooOo0 = false;
                oooO00o.OooO0oO();
                androidx.fragment.app.OooO00o oooO00o2 = fragmentManager.f64805OooO0oo;
                RunnableC20958OooOOO runnableC20958OooOOO = new RunnableC20958OooOOO(fragmentManager, 1);
                if (oooO00o2.f65023OooOOoo == null) {
                    oooO00o2.f65023OooOOoo = new ArrayList<>();
                }
                oooO00o2.f65023OooOOoo.add(runnableC20958OooOOO);
                fragmentManager.f64805OooO0oo.OooO0oo();
                fragmentManager.f64797OooO = true;
                fragmentManager.OooOoO(true);
                fragmentManager.Oooo00O();
                fragmentManager.f64797OooO = false;
                fragmentManager.f64805OooO0oo = null;
            }
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            boolean zOooo0o = FragmentManager.Oooo0o(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zOooo0o) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.f64797OooO = true;
            fragmentManager.OooOoO(true);
            fragmentManager.f64797OooO = false;
            androidx.fragment.app.OooO00o oooO00o = fragmentManager.f64805OooO0oo;
            OooO0O0 oooO0O0 = fragmentManager.f64806OooOO0;
            if (oooO00o == null) {
                if (oooO0O0.getIsEnabled()) {
                    if (FragmentManager.Oooo0o(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    fragmentManager.OoooO();
                    return;
                } else {
                    if (FragmentManager.Oooo0o(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.f64804OooO0oO.OooO0OO();
                    return;
                }
            }
            ArrayList<OooOOO> arrayList = fragmentManager.f64811OooOOOO;
            if (!arrayList.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(FragmentManager.Oooo00o(fragmentManager.f64805OooO0oo));
                for (OooOOO oooOOO : arrayList) {
                    for (Fragment fragment : linkedHashSet) {
                        oooOOO.getClass();
                    }
                }
            }
            Iterator<AbstractC21907Oooo.OooO00o> it = fragmentManager.f64805OooO0oo.f65008OooO0OO.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = it.next().f65026OooO0O0;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            for (AbstractC21925OoooOoO abstractC21925OoooOoO : fragmentManager.OooO0o(new ArrayList(Collections.singletonList(fragmentManager.f64805OooO0oo)), 0, 1)) {
                abstractC21925OoooOoO.getClass();
                if (FragmentManager.Oooo0o(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                ArrayList arrayList2 = abstractC21925OoooOoO.f65079OooO0OO;
                abstractC21925OoooOoO.OooOO0o(arrayList2);
                abstractC21925OoooOoO.OooO0OO(arrayList2);
            }
            Iterator<AbstractC21907Oooo.OooO00o> it2 = fragmentManager.f64805OooO0oo.f65008OooO0OO.iterator();
            while (it2.hasNext()) {
                Fragment fragment3 = it2.next().f65026OooO0O0;
                if (fragment3 != null && fragment3.mContainer == null) {
                    fragmentManager.OooO0oO(fragment3).OooOO0O();
                }
            }
            fragmentManager.f64805OooO0oo = null;
            fragmentManager.o00Oo0();
            if (FragmentManager.Oooo0o(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + oooO0O0.getIsEnabled() + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackProgressed(OooO0Oo.OooO0OO backEvent) {
            boolean zOooo0o = FragmentManager.Oooo0o(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zOooo0o) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.f64805OooO0oo != null) {
                for (AbstractC21925OoooOoO abstractC21925OoooOoO : fragmentManager.OooO0o(new ArrayList(Collections.singletonList(fragmentManager.f64805OooO0oo)), 0, 1)) {
                    abstractC21925OoooOoO.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f58182OooO0OO);
                    }
                    ArrayList arrayList = abstractC21925OoooOoO.f65079OooO0OO;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C34431OooOo0.OooOo0o(arrayList2, ((AbstractC21925OoooOoO.OooO0OO) it.next()).f65096OooOO0O);
                    }
                    List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(oOo000Oo.OooOo.o0OO00O(arrayList2));
                    int size = listO0ooOO0.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC21925OoooOoO.OooO00o) listO0ooOO0.get(i)).OooO0Oo(backEvent, abstractC21925OoooOoO.f65077OooO00o);
                    }
                }
                Iterator<OooOOO> it2 = fragmentManager.f64811OooOOOO.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackStarted(OooO0Oo.OooO0OO oooO0OO) {
            boolean zOooo0o = FragmentManager.Oooo0o(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zOooo0o) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.OooOo0o();
            fragmentManager.OooOo(fragmentManager.new C21883OooOOo0(), false);
        }
    }

    public class OooO0OO implements MenuProvider {
        public OooO0OO() {
        }

        @Override // androidx.core.view.MenuProvider
        public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.OooOO0O(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public final void onMenuClosed(Menu menu) {
            FragmentManager.this.OooOOo0(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public final boolean onMenuItemSelected(MenuItem menuItem) {
            return FragmentManager.this.OooOOOo(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public final void onPrepareMenu(Menu menu) {
            FragmentManager.this.OooOo00(menu);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooO0Oo, reason: case insensitive filesystem */
    public class C21876OooO0Oo extends C21901OooOoO0 {
        public C21876OooO0Oo() {
        }

        @Override // androidx.fragment.app.C21901OooOoO0
        public final Fragment OooO00o(ClassLoader classLoader, String str) {
            return Fragment.instantiate(FragmentManager.this.f64816OooOo.f64990OooOo, str, null);
        }
    }

    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.OooOoO(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooO0o0, reason: case insensitive filesystem */
    public class C21877OooO0o0 implements InterfaceC21927OoooOoo {
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooO0oO, reason: case insensitive filesystem */
    public class C21878OooO0oO implements InterfaceC21986OooOoOO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21912Oooo0o f64849OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ String f64850OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC21979OooOOo0 f64852OooOoO0;

        public C21878OooO0oO(String str, InterfaceC21912Oooo0o interfaceC21912Oooo0o, AbstractC21979OooOOo0 abstractC21979OooOOo0) {
            this.f64850OooOo0o = str;
            this.f64849OooOo = interfaceC21912Oooo0o;
            this.f64852OooOoO0 = abstractC21979OooOOo0;
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            Bundle bundle;
            AbstractC21979OooOOo0.OooO00o oooO00o2 = AbstractC21979OooOOo0.OooO00o.ON_START;
            String str = this.f64850OooOo0o;
            FragmentManager fragmentManager = FragmentManager.this;
            if (oooO00o == oooO00o2 && (bundle = fragmentManager.f64810OooOOO0.get(str)) != null) {
                this.f64849OooOo.OooO0OO(bundle, str);
                fragmentManager.f64810OooOOO0.remove(str);
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                }
            }
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
                this.f64852OooOoO0.OooO0OO(this);
                fragmentManager.f64809OooOOO.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooO0oo, reason: case insensitive filesystem */
    public class C21879OooO0oo implements InterfaceC21913Oooo0o0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Fragment f64853OooOo0o;

        public C21879OooO0oo(Fragment fragment) {
            this.f64853OooOo0o = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC21913Oooo0o0
        public final void OooO00o(FragmentManager fragmentManager, Fragment fragment) {
            this.f64853OooOo0o.onAttachFragment(fragment);
        }
    }

    public class OooOO0 implements OooO0o.OooO00o<ActivityResult> {
        public OooOO0() {
        }

        @Override // OooO0o.OooO00o
        public final void OooO0O0(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f64832Oooo00o.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            C21915Oooo0oo c21915Oooo0oo = fragmentManager.f64800OooO0OO;
            String str = launchedFragmentInfoPollFirst.f64842OooOo0o;
            Fragment fragmentOooO0OO = c21915Oooo0oo.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onActivityResult(launchedFragmentInfoPollFirst.f64841OooOo, activityResult2.f62240OooOo0o, activityResult2.f62239OooOo);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    public static class OooOO0O extends AbstractC20431OooO00o<IntentSenderRequest, ActivityResult> {
        @Override // OooO0oO.AbstractC20431OooO00o
        public final Intent OooO00o(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f62241OooOo;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest2.f62242OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(intentSender, "intentSender");
                    intentSenderRequest2 = new IntentSenderRequest(intentSender, null, intentSenderRequest2.f62244OooOoO0, intentSenderRequest2.f62243OooOoO);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // OooO0oO.AbstractC20431OooO00o
        public final ActivityResult OooO0OO(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooOO0o, reason: case insensitive filesystem */
    public static abstract class AbstractC21880OooOO0o {
        public void OooO00o(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void OooO0O0(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }

    public interface OooOOO {
        void OooO00o();
    }

    public static class OooOOO0 implements InterfaceC21912Oooo0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC21912Oooo0o f64855OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC21979OooOOo0 f64856OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C21878OooO0oO f64857OooOoO0;

        public OooOOO0(AbstractC21979OooOOo0 abstractC21979OooOOo0, InterfaceC21912Oooo0o interfaceC21912Oooo0o, C21878OooO0oO c21878OooO0oO) {
            this.f64856OooOo0o = abstractC21979OooOOo0;
            this.f64855OooOo = interfaceC21912Oooo0o;
            this.f64857OooOoO0 = c21878OooO0oO;
        }

        @Override // androidx.fragment.app.InterfaceC21912Oooo0o
        public final void OooO0OO(Bundle bundle, String str) {
            this.f64855OooOo.OooO0OO(bundle, str);
        }
    }

    public interface OooOOOO {
        boolean OooO00o(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooOOOo, reason: case insensitive filesystem */
    public class C21881OooOOOo implements OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f64858OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f64859OooO0O0;

        public C21881OooOOOo(String str, int i) {
            this.f64858OooO00o = str;
            this.f64859OooO0O0 = i;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOOOO
        public final boolean OooO00o(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f64823OooOoOO;
            if (fragment == null || this.f64859OooO0O0 >= 0 || this.f64858OooO00o != null || !fragment.getChildFragmentManager().OoooOO0(-1, 0)) {
                return FragmentManager.this.o000oOoO(arrayList, arrayList2, this.f64858OooO00o, this.f64859OooO0O0, 1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooOOo, reason: case insensitive filesystem */
    public class C21882OooOOo implements OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f64861OooO00o;

        public C21882OooOOo(String str) {
            this.f64861OooO00o = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
        
            r3.add(r6);
         */
        @Override // androidx.fragment.app.FragmentManager.OooOOOO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OooO00o(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            BackStackState backStackStateRemove = fragmentManager.f64808OooOO0o.remove(this.f64861OooO00o);
            boolean z = false;
            if (backStackStateRemove == null) {
                return false;
            }
            HashMap map = new HashMap();
            for (androidx.fragment.app.OooO00o oooO00o : arrayList) {
                if (oooO00o.f64907OooOo0o) {
                    Iterator<AbstractC21907Oooo.OooO00o> it = oooO00o.f65008OooO0OO.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().f65026OooO0O0;
                        if (fragment != null) {
                            map.put(fragment.mWho, fragment);
                        }
                    }
                }
            }
            ArrayList<String> arrayList3 = backStackStateRemove.f64750OooOo0o;
            HashMap map2 = new HashMap(arrayList3.size());
            for (String str : arrayList3) {
                Fragment fragment2 = (Fragment) map.get(str);
                if (fragment2 != null) {
                    map2.put(fragment2.mWho, fragment2);
                } else {
                    Bundle bundleOooO = fragmentManager.f64800OooO0OO.OooO(null, str);
                    if (bundleOooO != null) {
                        ClassLoader classLoader = fragmentManager.f64816OooOo.f64990OooOo.getClassLoader();
                        Fragment fragmentOooO00o = ((FragmentState) bundleOooO.getParcelable("state")).OooO00o(fragmentManager.Oooo0O0(), classLoader);
                        fragmentOooO00o.mSavedFragmentState = bundleOooO;
                        if (bundleOooO.getBundle("savedInstanceState") == null) {
                            fragmentOooO00o.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleOooO.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        fragmentOooO00o.setArguments(bundle);
                        map2.put(fragmentOooO00o.mWho, fragmentOooO00o);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (BackStackRecordState backStackRecordState : backStackStateRemove.f64749OooOo) {
                backStackRecordState.getClass();
                androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(fragmentManager);
                backStackRecordState.OooO00o(oooO00o2);
                int i = 0;
                while (true) {
                    ArrayList<String> arrayList5 = backStackRecordState.f64735OooOo;
                    if (i < arrayList5.size()) {
                        String str2 = arrayList5.get(i);
                        if (str2 != null) {
                            Fragment fragment3 = (Fragment) map2.get(str2);
                            if (fragment3 == null) {
                                throw new IllegalStateException(C21445Oooo.OooO0O0(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f64741OooOoo0, " failed due to missing saved state for Fragment (", str2, ")"));
                            }
                            oooO00o2.f65008OooO0OO.get(i).f65026OooO0O0 = fragment3;
                        }
                        i++;
                    }
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ((androidx.fragment.app.OooO00o) it2.next()).OooO00o(arrayList, arrayList2);
                z = true;
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooOOo0, reason: case insensitive filesystem */
    public class C21883OooOOo0 implements OooOOOO {
        public C21883OooOOo0() {
        }

        @Override // androidx.fragment.app.FragmentManager.OooOOOO
        public final boolean OooO00o(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2) {
            ArrayList<androidx.fragment.app.OooO00o> arrayList3;
            ArrayList<Boolean> arrayList4;
            boolean zO000oOoO;
            FragmentManager fragmentManager = FragmentManager.this;
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.f64798OooO00o);
            }
            if (fragmentManager.f64801OooO0Oo.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                arrayList3 = arrayList;
                zO000oOoO = false;
                arrayList4 = arrayList2;
            } else {
                androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) C21505OooO0Oo.OooO00o(1, fragmentManager.f64801OooO0Oo);
                fragmentManager.f64805OooO0oo = oooO00o;
                Iterator<AbstractC21907Oooo.OooO00o> it = oooO00o.f65008OooO0OO.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f65026OooO0O0;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zO000oOoO = fragmentManager.o000oOoO(arrayList3, arrayList4, null, -1, 0);
            }
            if (!fragmentManager.f64811OooOOOO.isEmpty() && arrayList3.size() > 0) {
                arrayList4.get(arrayList3.size() - 1).getClass();
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.OooO00o> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.Oooo00o(it2.next()));
                }
                for (OooOOO oooOOO : fragmentManager.f64811OooOOOO) {
                    for (Fragment fragment2 : linkedHashSet) {
                        oooOOO.getClass();
                    }
                }
            }
            return zO000oOoO;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$OooOOoo, reason: case insensitive filesystem */
    public class C21884OooOOoo implements OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f64864OooO00o;

        public C21884OooOOoo(String str) {
            this.f64864OooO00o = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOOOO
        public final boolean OooO00o(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2) throws Throwable {
            int i;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f64864OooO00o;
            int iOooOoo = fragmentManager.OooOoo(-1, str, true);
            if (iOooOoo < 0) {
                return false;
            }
            int i2 = iOooOoo;
            while (true) {
                Throwable th = null;
                if (i2 >= fragmentManager.f64801OooO0Oo.size()) {
                    HashSet hashSet = new HashSet();
                    int i3 = iOooOoo;
                    while (i3 < fragmentManager.f64801OooO0Oo.size()) {
                        androidx.fragment.app.OooO00o oooO00o = fragmentManager.f64801OooO0Oo.get(i3);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        for (AbstractC21907Oooo.OooO00o oooO00o2 : oooO00o.f65008OooO0OO) {
                            Fragment fragment = oooO00o2.f65026OooO0O0;
                            if (fragment != null) {
                                Throwable th2 = th;
                                if (!oooO00o2.f65027OooO0OO || (i = oooO00o2.f65025OooO00o) == 1 || i == 2 || i == 8) {
                                    hashSet.add(fragment);
                                    hashSet2.add(fragment);
                                }
                                int i4 = oooO00o2.f65025OooO00o;
                                if (i4 == 1 || i4 == 2) {
                                    hashSet3.add(fragment);
                                }
                                th = th2;
                            }
                        }
                        Throwable th3 = th;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            sbOooO0o0.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                            sbOooO0o0.append(" in ");
                            sbOooO0o0.append(oooO00o);
                            sbOooO0o0.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            fragmentManager.ooOO(new IllegalArgumentException(sbOooO0o0.toString()));
                            throw th3;
                        }
                        i3++;
                        th = th3;
                    }
                    Throwable th4 = th;
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                        if (fragment2.mRetainInstance) {
                            StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbOooO0o02.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                            sbOooO0o02.append("fragment ");
                            sbOooO0o02.append(fragment2);
                            fragmentManager.ooOO(new IllegalArgumentException(sbOooO0o02.toString()));
                            throw th4;
                        }
                        for (Fragment fragment3 : fragment2.mChildFragmentManager.f64800OooO0OO.OooO0o0()) {
                            if (fragment3 != null) {
                                arrayDeque.addLast(fragment3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Fragment) it.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.f64801OooO0Oo.size() - iOooOoo);
                    for (int i5 = iOooOoo; i5 < fragmentManager.f64801OooO0Oo.size(); i5++) {
                        arrayList4.add(th4);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.f64801OooO0Oo.size() - 1; size >= iOooOoo; size--) {
                        androidx.fragment.app.OooO00o oooO00oRemove = fragmentManager.f64801OooO0Oo.remove(size);
                        androidx.fragment.app.OooO00o oooO00o3 = new androidx.fragment.app.OooO00o(oooO00oRemove);
                        oooO00o3.OooO0oO();
                        arrayList4.set(size - iOooOoo, new BackStackRecordState(oooO00o3));
                        oooO00oRemove.f64907OooOo0o = true;
                        arrayList.add(oooO00oRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.f64808OooOO0o.put(str, backStackState);
                    return true;
                }
                androidx.fragment.app.OooO00o oooO00o4 = fragmentManager.f64801OooO0Oo.get(i2);
                if (!oooO00o4.f65021OooOOo) {
                    fragmentManager.ooOO(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + oooO00o4 + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
                i2++;
            }
        }
    }

    public static boolean Oooo(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f64823OooOoOO) && Oooo(fragmentManager.f64821OooOoO);
    }

    public static Fragment Oooo000(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet Oooo00o(androidx.fragment.app.OooO00o oooO00o) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < oooO00o.f65008OooO0OO.size(); i++) {
            Fragment fragment = oooO00o.f65008OooO0OO.get(i).f65026OooO0O0;
            if (fragment != null && oooO00o.f65005OooO) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean Oooo0o(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean Oooo0oO(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zOooo0oO = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f64800OooO0OO.OooO0o0()) {
            if (fragment2 != null) {
                zOooo0oO = Oooo0oO(fragment2);
            }
            if (zOooo0oO) {
                return true;
            }
        }
        return false;
    }

    public static void o0OoOo0(Fragment fragment) {
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void OooO(boolean z, Configuration configuration) {
        if (z && (this.f64816OooOo instanceof OnConfigurationChangedProvider)) {
            ooOO(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.OooO(true, configuration);
                }
            }
        }
    }

    public final C21914Oooo0oO OooO00o(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            o000Oo0.OooO0O0.OooO0OO(fragment, str);
        }
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C21914Oooo0oO c21914Oooo0oOOooO0oO = OooO0oO(fragment);
        fragment.mFragmentManager = this;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        c21915Oooo0oo.OooO0oO(c21914Oooo0oOOooO0oO);
        if (!fragment.mDetached) {
            c21915Oooo0oo.OooO00o(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Oooo0oO(fragment)) {
                this.f64829Oooo0 = true;
            }
        }
        return c21914Oooo0oOOooO0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(AbstractC21900OooOoO<?> abstractC21900OooOoO, AbstractC21899OooOo0o abstractC21899OooOo0o, Fragment fragment) {
        if (this.f64816OooOo != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f64816OooOo = abstractC21900OooOoO;
        this.f64822OooOoO0 = abstractC21899OooOo0o;
        this.f64821OooOoO = fragment;
        CopyOnWriteArrayList<InterfaceC21913Oooo0o0> copyOnWriteArrayList = this.f64814OooOOo0;
        if (fragment != null) {
            copyOnWriteArrayList.add(new C21879OooO0oo(fragment));
        } else if (abstractC21900OooOoO instanceof InterfaceC21913Oooo0o0) {
            copyOnWriteArrayList.add((InterfaceC21913Oooo0o0) abstractC21900OooOoO);
        }
        if (this.f64821OooOoO != null) {
            o00Oo0();
        }
        if (abstractC21900OooOoO instanceof OooO0Oo.Oooo000) {
            OooO0Oo.Oooo000 oooo000 = (OooO0Oo.Oooo000) abstractC21900OooOoO;
            C20418OooOoo onBackPressedDispatcher = oooo000.getOnBackPressedDispatcher();
            this.f64804OooO0oO = onBackPressedDispatcher;
            InterfaceC21987OooOoo interfaceC21987OooOoo = oooo000;
            if (fragment != null) {
                interfaceC21987OooOoo = fragment;
            }
            onBackPressedDispatcher.OooO00o(interfaceC21987OooOoo, this.f64806OooOO0);
        }
        if (fragment != null) {
            C21911Oooo0OO c21911Oooo0OO = fragment.mFragmentManager.f64840OoooO00;
            HashMap<String, C21911Oooo0OO> map = c21911Oooo0OO.f65041OooO0o0;
            C21911Oooo0OO c21911Oooo0OO2 = map.get(fragment.mWho);
            if (c21911Oooo0OO2 == null) {
                c21911Oooo0OO2 = new C21911Oooo0OO(c21911Oooo0OO.f65042OooO0oO);
                map.put(fragment.mWho, c21911Oooo0OO2);
            }
            this.f64840OoooO00 = c21911Oooo0OO2;
        } else if (abstractC21900OooOoO instanceof InterfaceC22023o00ooo) {
            this.f64840OoooO00 = (C21911Oooo0OO) new o00Oo0(((InterfaceC22023o00ooo) abstractC21900OooOoO).getViewModelStore(), C21911Oooo0OO.f65037OooOO0).OooO00o(C21911Oooo0OO.class);
        } else {
            this.f64840OoooO00 = new C21911Oooo0OO(false);
        }
        this.f64840OoooO00.f65038OooO = OoooO00();
        this.f64800OooO0OO.f65053OooO0Oo = this.f64840OoooO00;
        Object obj = this.f64816OooOo;
        if ((obj instanceof InterfaceC24753OooO0o0) && fragment == null) {
            o000ooo0.OooO0OO savedStateRegistry = ((InterfaceC24753OooO0o0) obj).getSavedStateRegistry();
            savedStateRegistry.OooO0OO("android:support:fragments", new OooO0OO.OooO0O0() { // from class: androidx.fragment.app.Oooo0
                @Override // o000ooo0.OooO0OO.OooO0O0
                public final Bundle OooO00o() {
                    return this.f65033OooO00o.Ooooo00();
                }
            });
            Bundle bundleOooO00o = savedStateRegistry.OooO00o("android:support:fragments");
            if (bundleOooO00o != null) {
                OoooOoo(bundleOooO00o);
            }
        }
        Object obj2 = this.f64816OooOo;
        if (obj2 instanceof OooO0o.OooO) {
            AbstractC20425OooO0o0 activityResultRegistry = ((OooO0o.OooO) obj2).getActivityResultRegistry();
            String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("FragmentManager:", fragment != null ? androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), fragment.mWho, C18241k5.f55433h) : "");
            this.f64827OooOooo = activityResultRegistry.OooO0Oo(C21111o0ooOoO.OooO0Oo(strOooO00o, "StartActivityForResult"), new C20439OooO0oo(), new OooO());
            this.f64830Oooo000 = activityResultRegistry.OooO0Oo(C21111o0ooOoO.OooO0Oo(strOooO00o, "StartIntentSenderForResult"), new OooOO0O(), new OooOO0());
            this.f64831Oooo00O = activityResultRegistry.OooO0Oo(C21111o0ooOoO.OooO0Oo(strOooO00o, "RequestPermissions"), new C20435OooO0o(), new OooO00o());
        }
        Object obj3 = this.f64816OooOo;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.f64813OooOOo);
        }
        Object obj4 = this.f64816OooOo;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.f64815OooOOoo);
        }
        Object obj5 = this.f64816OooOo;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f64818OooOo00);
        }
        Object obj6 = this.f64816OooOo;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.f64817OooOo0);
        }
        Object obj7 = this.f64816OooOo;
        if ((obj7 instanceof MenuHost) && fragment == null) {
            ((MenuHost) obj7).addMenuProvider(this.f64819OooOo0O);
        }
    }

    public final void OooO0OO(Fragment fragment) {
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f64800OooO0OO.OooO00o(fragment);
            if (Oooo0o(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Oooo0oO(fragment)) {
                this.f64829Oooo0 = true;
            }
        }
    }

    public final void OooO0Oo() {
        this.f64799OooO0O0 = false;
        this.f64838Oooo0oo.clear();
        this.f64837Oooo0oO.clear();
    }

    public final HashSet OooO0o(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC21907Oooo.OooO00o> it = ((androidx.fragment.app.OooO00o) arrayList.get(i)).f65008OooO0OO.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f65026OooO0O0;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC21925OoooOoO.OooO(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final HashSet OooO0o0() {
        Object c21885OooO0Oo;
        HashSet hashSet = new HashSet();
        Iterator it = this.f64800OooO0OO.OooO0Oo().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C21914Oooo0oO) it.next()).f65046OooO0OO.mContainer;
            if (viewGroup != null) {
                InterfaceC21927OoooOoo factory = Oooo0OO();
                kotlin.jvm.internal.OooOOO0.OooO0oO(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof AbstractC21925OoooOoO) {
                    c21885OooO0Oo = (AbstractC21925OoooOoO) tag;
                } else {
                    c21885OooO0Oo = new C21885OooO0Oo(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c21885OooO0Oo);
                }
                hashSet.add(c21885OooO0Oo);
            }
        }
        return hashSet;
    }

    public final C21914Oooo0oO OooO0oO(Fragment fragment) {
        String str = fragment.mWho;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        C21914Oooo0oO c21914Oooo0oO = c21915Oooo0oo.f65051OooO0O0.get(str);
        if (c21914Oooo0oO != null) {
            return c21914Oooo0oO;
        }
        C21914Oooo0oO c21914Oooo0oO2 = new C21914Oooo0oO(this.f64812OooOOOo, c21915Oooo0oo, fragment);
        c21914Oooo0oO2.OooOO0o(this.f64816OooOo.f64990OooOo.getClassLoader());
        c21914Oooo0oO2.f65048OooO0o0 = this.f64820OooOo0o;
        return c21914Oooo0oO2;
    }

    public final void OooO0oo(Fragment fragment) {
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Oooo0o(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
            synchronized (c21915Oooo0oo.f65050OooO00o) {
                c21915Oooo0oo.f65050OooO00o.remove(fragment);
            }
            fragment.mAdded = false;
            if (Oooo0oO(fragment)) {
                this.f64829Oooo0 = true;
            }
            Ooooooo(fragment);
        }
    }

    public final boolean OooOO0(MenuItem menuItem) {
        if (this.f64820OooOo0o < 1) {
            return false;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOO0O(Menu menu, MenuInflater menuInflater) {
        if (this.f64820OooOo0o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f64803OooO0o0 != null) {
            for (int i = 0; i < this.f64803OooO0o0.size(); i++) {
                Fragment fragment2 = this.f64803OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f64803OooO0o0 = arrayList;
        return z;
    }

    public final void OooOO0o() {
        boolean zIsChangingConfigurations = true;
        this.f64836Oooo0o0 = true;
        OooOoO(true);
        OooOo0o();
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.f64816OooOo;
        boolean z = abstractC21900OooOoO instanceof InterfaceC22023o00ooo;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        if (z) {
            zIsChangingConfigurations = c21915Oooo0oo.f65053OooO0Oo.f65043OooO0oo;
        } else {
            ActivityC21897OooOo0 activityC21897OooOo0 = abstractC21900OooOoO.f64990OooOo;
            if (activityC21897OooOo0 != null) {
                zIsChangingConfigurations = true ^ activityC21897OooOo0.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it = this.f64808OooOO0o.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().f64750OooOo0o.iterator();
                while (it2.hasNext()) {
                    c21915Oooo0oo.f65053OooO0Oo.OooO0oO((String) it2.next(), false);
                }
            }
        }
        OooOo0(-1);
        Object obj = this.f64816OooOo;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.f64815OooOOoo);
        }
        Object obj2 = this.f64816OooOo;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.f64813OooOOo);
        }
        Object obj3 = this.f64816OooOo;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f64818OooOo00);
        }
        Object obj4 = this.f64816OooOo;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.f64817OooOo0);
        }
        Object obj5 = this.f64816OooOo;
        if ((obj5 instanceof MenuHost) && this.f64821OooOoO == null) {
            ((MenuHost) obj5).removeMenuProvider(this.f64819OooOo0O);
        }
        this.f64816OooOo = null;
        this.f64822OooOoO0 = null;
        this.f64821OooOoO = null;
        if (this.f64804OooO0oO != null) {
            this.f64806OooOO0.remove();
            this.f64804OooO0oO = null;
        }
        C20427OooO0oo c20427OooO0oo = this.f64827OooOooo;
        if (c20427OooO0oo != null) {
            c20427OooO0oo.OooO0O0();
            this.f64830Oooo000.OooO0O0();
            this.f64831Oooo00O.OooO0O0();
        }
    }

    public final void OooOOO(boolean z, boolean z2) {
        if (z2 && (this.f64816OooOo instanceof OnMultiWindowModeChangedProvider)) {
            ooOO(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.OooOOO(z, true);
                }
            }
        }
    }

    public final void OooOOO0(boolean z) {
        if (z && (this.f64816OooOo instanceof OnTrimMemoryProvider)) {
            ooOO(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.OooOOO0(true);
                }
            }
        }
    }

    public final void OooOOOO() {
        for (Fragment fragment : this.f64800OooO0OO.OooO0o0()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.OooOOOO();
            }
        }
    }

    public final boolean OooOOOo(MenuItem menuItem) {
        if (this.f64820OooOo0o < 1) {
            return false;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void OooOOo(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f64800OooO0OO.OooO0O0(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void OooOOo0(Menu menu) {
        if (this.f64820OooOo0o < 1) {
            return;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void OooOOoo(boolean z, boolean z2) {
        if (z2 && (this.f64816OooOo instanceof OnPictureInPictureModeChangedProvider)) {
            ooOO(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.OooOOoo(z, true);
                }
            }
        }
    }

    public final void OooOo(OooOOOO oooOOOO, boolean z) {
        if (!z) {
            if (this.f64816OooOo == null) {
                if (!this.f64836Oooo0o0) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (OoooO00()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f64798OooO00o) {
            try {
                if (this.f64816OooOo == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f64798OooO00o.add(oooOOOO);
                    OooooO0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOo0(int i) {
        try {
            this.f64799OooO0O0 = true;
            for (C21914Oooo0oO c21914Oooo0oO : this.f64800OooO0OO.f65051OooO0O0.values()) {
                if (c21914Oooo0oO != null) {
                    c21914Oooo0oO.f65048OooO0o0 = i;
                }
            }
            OoooO0(i, false);
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((AbstractC21925OoooOoO) it.next()).OooO0oo();
            }
            this.f64799OooO0O0 = false;
            OooOoO(true);
        } catch (Throwable th) {
            this.f64799OooO0O0 = false;
            throw th;
        }
    }

    public final boolean OooOo00(Menu menu) {
        boolean z = false;
        if (this.f64820OooOo0o < 1) {
            return false;
        }
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void OooOo0O(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, "    ");
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        c21915Oooo0oo.getClass();
        String str2 = str + "    ";
        HashMap<String, C21914Oooo0oO> map = c21915Oooo0oo.f65051OooO0O0;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C21914Oooo0oO c21914Oooo0oO : map.values()) {
                printWriter.print(str);
                if (c21914Oooo0oO != null) {
                    Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(CloudMetaExtra.DEFINE_NON_PARENT_ID);
                }
            }
        }
        ArrayList<Fragment> arrayList = c21915Oooo0oo.f65050OooO00o;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f64803OooO0o0;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = this.f64803OooO0o0.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f64801OooO0Oo.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.fragment.app.OooO00o oooO00o = this.f64801OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(oooO00o.toString());
                oooO00o.OooOO0o(strOooO0Oo, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f64807OooOO0O.get());
        synchronized (this.f64798OooO00o) {
            try {
                int size4 = this.f64798OooO00o.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (OooOOOO) this.f64798OooO00o.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f64816OooOo);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f64822OooOoO0);
        if (this.f64821OooOoO != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f64821OooOoO);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f64820OooOo0o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f64833Oooo0O0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f64834Oooo0OO);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f64836Oooo0o0);
        if (this.f64829Oooo0) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f64829Oooo0);
        }
    }

    public final void OooOo0o() {
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((AbstractC21925OoooOoO) it.next()).OooO0oo();
        }
    }

    public final boolean OooOoO(boolean z) {
        boolean zOooO00o;
        androidx.fragment.app.OooO00o oooO00o;
        OooOoO0(z);
        if (!this.f64797OooO && (oooO00o = this.f64805OooO0oo) != null) {
            oooO00o.f64904OooOo0 = false;
            oooO00o.OooO0oO();
            if (Oooo0o(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f64805OooO0oo + " as part of execPendingActions for actions " + this.f64798OooO00o);
            }
            this.f64805OooO0oo.OooO(false, false);
            this.f64798OooO00o.add(0, this.f64805OooO0oo);
            Iterator<AbstractC21907Oooo.OooO00o> it = this.f64805OooO0oo.f65008OooO0OO.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f65026OooO0O0;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f64805OooO0oo = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.OooO00o> arrayList = this.f64837Oooo0oO;
            ArrayList<Boolean> arrayList2 = this.f64838Oooo0oo;
            synchronized (this.f64798OooO00o) {
                if (this.f64798OooO00o.isEmpty()) {
                    zOooO00o = false;
                } else {
                    try {
                        int size = this.f64798OooO00o.size();
                        zOooO00o = false;
                        for (int i = 0; i < size; i++) {
                            zOooO00o |= this.f64798OooO00o.get(i).OooO00o(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zOooO00o) {
                break;
            }
            this.f64799OooO0O0 = true;
            try {
                OoooOoO(this.f64837Oooo0oO, this.f64838Oooo0oo);
                OooO0Oo();
                z2 = true;
            } catch (Throwable th) {
                OooO0Oo();
                throw th;
            }
        }
        o00Oo0();
        if (this.f64835Oooo0o) {
            this.f64835Oooo0o = false;
            for (C21914Oooo0oO c21914Oooo0oO : this.f64800OooO0OO.OooO0Oo()) {
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                if (fragment2.mDeferStart) {
                    if (this.f64799OooO0O0) {
                        this.f64835Oooo0o = true;
                    } else {
                        fragment2.mDeferStart = false;
                        c21914Oooo0oO.OooOO0O();
                    }
                }
            }
        }
        this.f64800OooO0OO.f65051OooO0O0.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void OooOoO0(boolean z) {
        if (this.f64799OooO0O0) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f64816OooOo == null) {
            if (!this.f64836Oooo0o0) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f64816OooOo.f64993OooOoO0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && OoooO00()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f64837Oooo0oO == null) {
            this.f64837Oooo0oO = new ArrayList<>();
            this.f64838Oooo0oo = new ArrayList<>();
        }
    }

    public final void OooOoOO(androidx.fragment.app.OooO00o oooO00o, boolean z) {
        if (z && (this.f64816OooOo == null || this.f64836Oooo0o0)) {
            return;
        }
        OooOoO0(z);
        androidx.fragment.app.OooO00o oooO00o2 = this.f64805OooO0oo;
        if (oooO00o2 != null) {
            oooO00o2.f64904OooOo0 = false;
            oooO00o2.OooO0oO();
            if (Oooo0o(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f64805OooO0oo + " as part of execSingleAction for action " + oooO00o);
            }
            this.f64805OooO0oo.OooO(false, false);
            this.f64805OooO0oo.OooO00o(this.f64837Oooo0oO, this.f64838Oooo0oo);
            Iterator<AbstractC21907Oooo.OooO00o> it = this.f64805OooO0oo.f65008OooO0OO.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f65026OooO0O0;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f64805OooO0oo = null;
        }
        oooO00o.OooO00o(this.f64837Oooo0oO, this.f64838Oooo0oo);
        this.f64799OooO0O0 = true;
        try {
            OoooOoO(this.f64837Oooo0oO, this.f64838Oooo0oo);
            OooO0Oo();
            o00Oo0();
            boolean z2 = this.f64835Oooo0o;
            C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
            if (z2) {
                this.f64835Oooo0o = false;
                for (C21914Oooo0oO c21914Oooo0oO : c21915Oooo0oo.OooO0Oo()) {
                    Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                    if (fragment2.mDeferStart) {
                        if (this.f64799OooO0O0) {
                            this.f64835Oooo0o = true;
                        } else {
                            fragment2.mDeferStart = false;
                            c21914Oooo0oO.OooOO0O();
                        }
                    }
                }
            }
            c21915Oooo0oo.f65051OooO0O0.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            OooO0Oo();
            throw th;
        }
    }

    public final int OooOoo(int i, String str, boolean z) {
        if (this.f64801OooO0Oo.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f64801OooO0Oo.size() - 1;
        }
        int size = this.f64801OooO0Oo.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.OooO00o oooO00o = this.f64801OooO0Oo.get(size);
            if ((str != null && str.equals(oooO00o.f65015OooOO0O)) || (i >= 0 && i == oooO00o.f64906OooOo0O)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f64801OooO0Oo.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.OooO00o oooO00o2 = this.f64801OooO0Oo.get(size - 1);
            if ((str == null || !str.equals(oooO00o2.f65015OooOO0O)) && (i < 0 || i != oooO00o2.f64906OooOo0O)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0223 A[PHI: r13
      0x0223: PHI (r13v13 int) = (r13v12 int), (r13v14 int) binds: [B:102:0x0213, B:107:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOoo0(ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        boolean z6 = ((androidx.fragment.app.OooO00o) arrayList.get(i)).f65021OooOOo;
        ArrayList<Fragment> arrayList3 = this.f64828Oooo;
        if (arrayList3 == null) {
            this.f64828Oooo = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<Fragment> arrayList4 = this.f64828Oooo;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        arrayList4.addAll(c21915Oooo0oo.OooO0o());
        Fragment fragment = this.f64823OooOoOO;
        int i7 = i;
        boolean z7 = false;
        while (true) {
            int i8 = 1;
            if (i7 >= i2) {
                boolean z8 = z6;
                boolean z9 = z7;
                this.f64828Oooo.clear();
                if (!z8 && this.f64820OooOo0o >= 1) {
                    for (int i9 = i; i9 < i2; i9++) {
                        Iterator<AbstractC21907Oooo.OooO00o> it = ((androidx.fragment.app.OooO00o) arrayList.get(i9)).f65008OooO0OO.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f65026OooO0O0;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                c21915Oooo0oo.OooO0oO(OooO0oO(fragment2));
                            }
                        }
                    }
                }
                for (int i10 = i; i10 < i2; i10++) {
                    androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) arrayList.get(i10);
                    if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                        oooO00o.OooO0o(-1);
                        ArrayList<AbstractC21907Oooo.OooO00o> arrayList5 = oooO00o.f65008OooO0OO;
                        boolean z10 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            AbstractC21907Oooo.OooO00o oooO00o2 = arrayList5.get(size);
                            Fragment fragment3 = oooO00o2.f65026OooO0O0;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = oooO00o.f64907OooOo0o;
                                fragment3.setPopDirection(z10);
                                int i11 = oooO00o.f65013OooO0oo;
                                int i12 = InputDeviceCompat.SOURCE_MOUSE;
                                int i13 = EditingLanguage.ARABIC_LIBYA;
                                if (i11 != 4097) {
                                    if (i11 != 8194) {
                                        i12 = EditingLanguage.CHINESE_SINGAPORE;
                                        i13 = 8197;
                                        if (i11 != 8197) {
                                            i12 = i11 != 4099 ? i11 != 4100 ? 0 : i13 : 4099;
                                        }
                                    }
                                }
                                fragment3.setNextTransition(i12);
                                fragment3.setSharedElementNames(oooO00o.f65022OooOOo0, oooO00o.f65020OooOOOo);
                            }
                            int i14 = oooO00o2.f65025OooO00o;
                            FragmentManager fragmentManager = oooO00o.f64905OooOo00;
                            switch (i14) {
                                case 1:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    z10 = true;
                                    fragmentManager.OooooOO(fragment3, true);
                                    fragmentManager.OoooOo0(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o2.f65025OooO00o);
                                case 3:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    fragmentManager.OooO00o(fragment3);
                                    z10 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    fragmentManager.getClass();
                                    o0OoOo0(fragment3);
                                    z10 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    fragmentManager.OooooOO(fragment3, true);
                                    fragmentManager.Oooo0o0(fragment3);
                                    z10 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    fragmentManager.OooO0OO(fragment3);
                                    z10 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(oooO00o2.f65028OooO0Oo, oooO00o2.f65030OooO0o0, oooO00o2.f65029OooO0o, oooO00o2.f65031OooO0oO);
                                    fragmentManager.OooooOO(fragment3, true);
                                    fragmentManager.OooO0oo(fragment3);
                                    z10 = true;
                                    break;
                                case 8:
                                    fragmentManager.OoooooO(null);
                                    z10 = true;
                                    break;
                                case 9:
                                    fragmentManager.OoooooO(fragment3);
                                    z10 = true;
                                    break;
                                case 10:
                                    fragmentManager.Oooooo(fragment3, oooO00o2.f65032OooO0oo);
                                    z10 = true;
                                    break;
                            }
                        }
                    } else {
                        oooO00o.OooO0o(1);
                        ArrayList<AbstractC21907Oooo.OooO00o> arrayList6 = oooO00o.f65008OooO0OO;
                        int size2 = arrayList6.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            AbstractC21907Oooo.OooO00o oooO00o3 = arrayList6.get(i15);
                            Fragment fragment4 = oooO00o3.f65026OooO0O0;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = oooO00o.f64907OooOo0o;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(oooO00o.f65013OooO0oo);
                                fragment4.setSharedElementNames(oooO00o.f65020OooOOOo, oooO00o.f65022OooOOo0);
                            }
                            int i16 = oooO00o3.f65025OooO00o;
                            FragmentManager fragmentManager2 = oooO00o.f64905OooOo00;
                            switch (i16) {
                                case 1:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.OooooOO(fragment4, false);
                                    fragmentManager2.OooO00o(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o3.f65025OooO00o);
                                case 3:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.OoooOo0(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.Oooo0o0(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.OooooOO(fragment4, false);
                                    o0OoOo0(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.OooO0oo(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(oooO00o3.f65028OooO0Oo, oooO00o3.f65030OooO0o0, oooO00o3.f65029OooO0o, oooO00o3.f65031OooO0oO);
                                    fragmentManager2.OooooOO(fragment4, false);
                                    fragmentManager2.OooO0OO(fragment4);
                                    break;
                                case 8:
                                    fragmentManager2.OoooooO(fragment4);
                                    break;
                                case 9:
                                    fragmentManager2.OoooooO(null);
                                    break;
                                case 10:
                                    fragmentManager2.Oooooo(fragment4, oooO00o3.f65024OooO);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList<OooOOO> arrayList7 = this.f64811OooOOOO;
                if (z9 && !arrayList7.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(Oooo00o((androidx.fragment.app.OooO00o) it2.next()));
                    }
                    if (this.f64805OooO0oo == null) {
                        for (OooOOO oooOOO : arrayList7) {
                            for (Fragment fragment5 : linkedHashSet) {
                                oooOOO.getClass();
                            }
                        }
                        for (OooOOO oooOOO2 : arrayList7) {
                            for (Fragment fragment6 : linkedHashSet) {
                                oooOOO2.getClass();
                            }
                        }
                    }
                }
                for (int i17 = i; i17 < i2; i17++) {
                    androidx.fragment.app.OooO00o oooO00o4 = (androidx.fragment.app.OooO00o) arrayList.get(i17);
                    if (zBooleanValue) {
                        for (int size3 = oooO00o4.f65008OooO0OO.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment7 = oooO00o4.f65008OooO0OO.get(size3).f65026OooO0O0;
                            if (fragment7 != null) {
                                OooO0oO(fragment7).OooOO0O();
                            }
                        }
                    } else {
                        Iterator<AbstractC21907Oooo.OooO00o> it3 = oooO00o4.f65008OooO0OO.iterator();
                        while (it3.hasNext()) {
                            Fragment fragment8 = it3.next().f65026OooO0O0;
                            if (fragment8 != null) {
                                OooO0oO(fragment8).OooOO0O();
                            }
                        }
                    }
                }
                OoooO0(this.f64820OooOo0o, true);
                for (AbstractC21925OoooOoO abstractC21925OoooOoO : OooO0o(arrayList, i, i2)) {
                    abstractC21925OoooOoO.f65082OooO0o0 = zBooleanValue;
                    abstractC21925OoooOoO.OooOO0O();
                    abstractC21925OoooOoO.OooO0o0();
                }
                for (int i18 = i; i18 < i2; i18++) {
                    androidx.fragment.app.OooO00o oooO00o5 = (androidx.fragment.app.OooO00o) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue() && oooO00o5.f64906OooOo0O >= 0) {
                        oooO00o5.f64906OooOo0O = -1;
                    }
                    if (oooO00o5.f65023OooOOoo != null) {
                        for (int i19 = 0; i19 < oooO00o5.f65023OooOOoo.size(); i19++) {
                            oooO00o5.f65023OooOOoo.get(i19).run();
                        }
                        oooO00o5.f65023OooOOoo = null;
                    }
                }
                if (z9) {
                    for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                        arrayList7.get(i20).OooO00o();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.OooO00o oooO00o6 = (androidx.fragment.app.OooO00o) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                z = z6;
                i3 = i7;
                z2 = z7;
                int i21 = 1;
                ArrayList<Fragment> arrayList8 = this.f64828Oooo;
                ArrayList<AbstractC21907Oooo.OooO00o> arrayList9 = oooO00o6.f65008OooO0OO;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    AbstractC21907Oooo.OooO00o oooO00o7 = arrayList9.get(size4);
                    int i22 = oooO00o7.f65025OooO00o;
                    if (i22 != i21) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 6:
                                    arrayList8.add(oooO00o7.f65026OooO0O0);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = oooO00o7.f65026OooO0O0;
                                    break;
                                case 10:
                                    oooO00o7.f65024OooO = oooO00o7.f65032OooO0oo;
                                    break;
                            }
                        }
                        size4--;
                        i21 = 1;
                    }
                    arrayList8.remove(oooO00o7.f65026OooO0O0);
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList10 = this.f64828Oooo;
                int i23 = 0;
                while (true) {
                    ArrayList<AbstractC21907Oooo.OooO00o> arrayList11 = oooO00o6.f65008OooO0OO;
                    if (i23 < arrayList11.size()) {
                        AbstractC21907Oooo.OooO00o oooO00o8 = arrayList11.get(i23);
                        int i24 = oooO00o8.f65025OooO00o;
                        if (i24 != i8) {
                            z3 = z6;
                            if (i24 != 2) {
                                if (i24 == 3 || i24 == 6) {
                                    arrayList10.remove(oooO00o8.f65026OooO0O0);
                                    Fragment fragment9 = oooO00o8.f65026OooO0O0;
                                    if (fragment9 == fragment) {
                                        arrayList11.add(i23, new AbstractC21907Oooo.OooO00o(fragment9, 9));
                                        i23++;
                                        i5 = i7;
                                        z4 = z7;
                                        i4 = 1;
                                        fragment = null;
                                    }
                                } else if (i24 == 7) {
                                    i4 = 1;
                                } else if (i24 == 8) {
                                    arrayList11.add(i23, new AbstractC21907Oooo.OooO00o(fragment, 9, 0));
                                    oooO00o8.f65027OooO0OO = true;
                                    i23++;
                                    fragment = oooO00o8.f65026OooO0O0;
                                }
                                i5 = i7;
                                z4 = z7;
                                i4 = 1;
                            } else {
                                Fragment fragment10 = oooO00o8.f65026OooO0O0;
                                int i25 = fragment10.mContainerId;
                                int size5 = arrayList10.size() - 1;
                                boolean z11 = false;
                                while (size5 >= 0) {
                                    int i26 = size5;
                                    Fragment fragment11 = arrayList10.get(size5);
                                    int i27 = i7;
                                    if (fragment11.mContainerId != i25) {
                                        z5 = z7;
                                    } else if (fragment11 == fragment10) {
                                        z5 = z7;
                                        z11 = true;
                                    } else {
                                        if (fragment11 == fragment) {
                                            z5 = z7;
                                            i6 = 0;
                                            arrayList11.add(i23, new AbstractC21907Oooo.OooO00o(fragment11, 9, 0));
                                            i23++;
                                            fragment = null;
                                        } else {
                                            z5 = z7;
                                            i6 = 0;
                                        }
                                        AbstractC21907Oooo.OooO00o oooO00o9 = new AbstractC21907Oooo.OooO00o(fragment11, 3, i6);
                                        oooO00o9.f65028OooO0Oo = oooO00o8.f65028OooO0Oo;
                                        oooO00o9.f65029OooO0o = oooO00o8.f65029OooO0o;
                                        oooO00o9.f65030OooO0o0 = oooO00o8.f65030OooO0o0;
                                        oooO00o9.f65031OooO0oO = oooO00o8.f65031OooO0oO;
                                        arrayList11.add(i23, oooO00o9);
                                        arrayList10.remove(fragment11);
                                        i23++;
                                        fragment = fragment;
                                    }
                                    size5 = i26 - 1;
                                    z7 = z5;
                                    i7 = i27;
                                }
                                i5 = i7;
                                z4 = z7;
                                i4 = 1;
                                if (z11) {
                                    arrayList11.remove(i23);
                                    i23--;
                                } else {
                                    oooO00o8.f65025OooO00o = 1;
                                    oooO00o8.f65027OooO0OO = true;
                                    arrayList10.add(fragment10);
                                }
                            }
                            i23 += i4;
                            i8 = i4;
                            z6 = z3;
                            z7 = z4;
                            i7 = i5;
                        } else {
                            z3 = z6;
                            i4 = i8;
                        }
                        i5 = i7;
                        z4 = z7;
                        arrayList10.add(oooO00o8.f65026OooO0O0);
                        i23 += i4;
                        i8 = i4;
                        z6 = z3;
                        z7 = z4;
                        i7 = i5;
                    } else {
                        z = z6;
                        i3 = i7;
                        z2 = z7;
                    }
                }
            }
            z7 = z2 || oooO00o6.f65005OooO;
            i7 = i3 + 1;
            z6 = z;
        }
    }

    public final Fragment OooOooO(int i) {
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        ArrayList<Fragment> arrayList = c21915Oooo0oo.f65050OooO00o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C21914Oooo0oO c21914Oooo0oO : c21915Oooo0oo.f65051OooO0O0.values()) {
            if (c21914Oooo0oO != null) {
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment OooOooo(String str) {
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        if (str != null) {
            ArrayList<Fragment> arrayList = c21915Oooo0oo.f65050OooO00o;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            c21915Oooo0oo.getClass();
            return null;
        }
        for (C21914Oooo0oO c21914Oooo0oO : c21915Oooo0oo.f65051OooO0O0.values()) {
            if (c21914Oooo0oO != null) {
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final ViewGroup Oooo0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f64822OooOoO0.OooO0OO()) {
            return null;
        }
        View viewOooO0O0 = this.f64822OooOoO0.OooO0O0(fragment.mContainerId);
        if (viewOooO0O0 instanceof ViewGroup) {
            return (ViewGroup) viewOooO0O0;
        }
        return null;
    }

    public final void Oooo00O() {
        for (AbstractC21925OoooOoO abstractC21925OoooOoO : OooO0o0()) {
            if (abstractC21925OoooOoO.f65081OooO0o) {
                if (Oooo0o(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                abstractC21925OoooOoO.f65081OooO0o = false;
                abstractC21925OoooOoO.OooO0o0();
            }
        }
    }

    public final C21901OooOoO0 Oooo0O0() {
        C28617OooOOOo c28617OooOOOo = this.f64825OooOoo0;
        if (c28617OooOOOo != null) {
            return c28617OooOOOo;
        }
        Fragment fragment = this.f64821OooOoO;
        return fragment != null ? fragment.mFragmentManager.Oooo0O0() : this.f64824OooOoo;
    }

    public final InterfaceC21927OoooOoo Oooo0OO() {
        Fragment fragment = this.f64821OooOoO;
        return fragment != null ? fragment.mFragmentManager.Oooo0OO() : this.f64826OooOooO;
    }

    public final void Oooo0o0(Fragment fragment) {
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        Ooooooo(fragment);
    }

    public final boolean Oooo0oo() {
        Fragment fragment = this.f64821OooOoO;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f64821OooOoO.getParentFragmentManager().Oooo0oo();
    }

    public final boolean OoooO() {
        return OoooOO0(-1, 0);
    }

    public final void OoooO0(int i, boolean z) {
        HashMap<String, C21914Oooo0oO> map;
        AbstractC21900OooOoO<?> abstractC21900OooOoO;
        if (this.f64816OooOo == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f64820OooOo0o) {
            this.f64820OooOo0o = i;
            C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
            Iterator<Fragment> it = c21915Oooo0oo.f65050OooO00o.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = c21915Oooo0oo.f65051OooO0O0;
                if (!zHasNext) {
                    break;
                }
                C21914Oooo0oO c21914Oooo0oO = map.get(it.next().mWho);
                if (c21914Oooo0oO != null) {
                    c21914Oooo0oO.OooOO0O();
                }
            }
            for (C21914Oooo0oO c21914Oooo0oO2 : map.values()) {
                if (c21914Oooo0oO2 != null) {
                    c21914Oooo0oO2.OooOO0O();
                    Fragment fragment = c21914Oooo0oO2.f65046OooO0OO;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !c21915Oooo0oo.f65052OooO0OO.containsKey(fragment.mWho)) {
                            c21915Oooo0oo.OooO(c21914Oooo0oO2.OooOOO(), fragment.mWho);
                        }
                        c21915Oooo0oo.OooO0oo(c21914Oooo0oO2);
                    }
                }
            }
            for (C21914Oooo0oO c21914Oooo0oO3 : c21915Oooo0oo.OooO0Oo()) {
                Fragment fragment2 = c21914Oooo0oO3.f65046OooO0OO;
                if (fragment2.mDeferStart) {
                    if (this.f64799OooO0O0) {
                        this.f64835Oooo0o = true;
                    } else {
                        fragment2.mDeferStart = false;
                        c21914Oooo0oO3.OooOO0O();
                    }
                }
            }
            if (this.f64829Oooo0 && (abstractC21900OooOoO = this.f64816OooOo) != null && this.f64820OooOo0o == 7) {
                abstractC21900OooOoO.OooO0oo();
                this.f64829Oooo0 = false;
            }
        }
    }

    public final boolean OoooO00() {
        return this.f64833Oooo0O0 || this.f64834Oooo0OO;
    }

    public final void OoooO0O() {
        if (this.f64816OooOo == null) {
            return;
        }
        this.f64833Oooo0O0 = false;
        this.f64834Oooo0OO = false;
        this.f64840OoooO00.f65038OooO = false;
        for (Fragment fragment : this.f64800OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean OoooOO0(int i, int i2) {
        OooOoO(false);
        OooOoO0(true);
        Fragment fragment = this.f64823OooOoOO;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().OoooO()) {
            return true;
        }
        boolean zO000oOoO = o000oOoO(this.f64837Oooo0oO, this.f64838Oooo0oo, null, i, i2);
        if (zO000oOoO) {
            this.f64799OooO0O0 = true;
            try {
                OoooOoO(this.f64837Oooo0oO, this.f64838Oooo0oo);
            } finally {
                OooO0Oo();
            }
        }
        o00Oo0();
        boolean z = this.f64835Oooo0o;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        if (z) {
            this.f64835Oooo0o = false;
            for (C21914Oooo0oO c21914Oooo0oO : c21915Oooo0oo.OooO0Oo()) {
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                if (fragment2.mDeferStart) {
                    if (this.f64799OooO0O0) {
                        this.f64835Oooo0o = true;
                    } else {
                        fragment2.mDeferStart = false;
                        c21914Oooo0oO.OooOO0O();
                    }
                }
            }
        }
        c21915Oooo0oo.f65051OooO0O0.values().removeAll(Collections.singleton(null));
        return zO000oOoO;
    }

    public final void OoooOOO(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            ooOO(new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void OoooOOo(AbstractC21880OooOO0o cb, boolean z) {
        C21905OooOooO c21905OooOooO = this.f64812OooOOOo;
        c21905OooOooO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(cb, "cb");
        c21905OooOooO.f65001OooO0O0.add(new C21905OooOooO.OooO00o(cb, z));
    }

    public final void OoooOo0(Fragment fragment) {
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        synchronized (c21915Oooo0oo.f65050OooO00o) {
            c21915Oooo0oo.f65050OooO00o.remove(fragment);
        }
        fragment.mAdded = false;
        if (Oooo0oO(fragment)) {
            this.f64829Oooo0 = true;
        }
        fragment.mRemoving = true;
        Ooooooo(fragment);
    }

    public final void OoooOoO(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f65021OooOOo) {
                if (i2 != i) {
                    OooOoo0(arrayList, i2, i, arrayList2);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f65021OooOOo) {
                        i2++;
                    }
                }
                OooOoo0(arrayList, i, i2, arrayList2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            OooOoo0(arrayList, i2, size, arrayList2);
        }
    }

    public final void OoooOoo(Bundle bundle) {
        C21905OooOooO c21905OooOooO;
        C21914Oooo0oO c21914Oooo0oO;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f64816OooOo.f64990OooOo.getClassLoader());
                this.f64810OooOOO0.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f64816OooOo.f64990OooOo.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        HashMap<String, Bundle> map2 = c21915Oooo0oo.f65052OooO0OO;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap<String, C21914Oooo0oO> map3 = c21915Oooo0oo.f65051OooO0O0;
        map3.clear();
        Iterator<String> it = fragmentManagerState.f64867OooOo0o.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c21905OooOooO = this.f64812OooOOOo;
            if (!zHasNext) {
                break;
            }
            Bundle bundleOooO = c21915Oooo0oo.OooO(null, it.next());
            if (bundleOooO != null) {
                Fragment fragment = this.f64840OoooO00.f65039OooO0Oo.get(((FragmentState) bundleOooO.getParcelable("state")).f64874OooOo);
                if (fragment != null) {
                    if (Oooo0o(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    c21914Oooo0oO = new C21914Oooo0oO(c21905OooOooO, c21915Oooo0oo, fragment, bundleOooO);
                } else {
                    c21914Oooo0oO = new C21914Oooo0oO(this.f64812OooOOOo, this.f64800OooO0OO, this.f64816OooOo.f64990OooOo.getClassLoader(), Oooo0O0(), bundleOooO);
                }
                Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
                fragment2.mSavedFragmentState = bundleOooO;
                fragment2.mFragmentManager = this;
                if (Oooo0o(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                c21914Oooo0oO.OooOO0o(this.f64816OooOo.f64990OooOo.getClassLoader());
                c21915Oooo0oo.OooO0oO(c21914Oooo0oO);
                c21914Oooo0oO.f65048OooO0o0 = this.f64820OooOo0o;
            }
        }
        C21911Oooo0OO c21911Oooo0OO = this.f64840OoooO00;
        c21911Oooo0OO.getClass();
        for (Fragment fragment3 : new ArrayList(c21911Oooo0OO.f65039OooO0Oo.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (Oooo0o(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f64867OooOo0o);
                }
                this.f64840OoooO00.OooO(fragment3);
                fragment3.mFragmentManager = this;
                C21914Oooo0oO c21914Oooo0oO2 = new C21914Oooo0oO(c21905OooOooO, c21915Oooo0oo, fragment3);
                c21914Oooo0oO2.f65048OooO0o0 = 1;
                c21914Oooo0oO2.OooOO0O();
                fragment3.mRemoving = true;
                c21914Oooo0oO2.OooOO0O();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f64866OooOo;
        c21915Oooo0oo.f65050OooO00o.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentOooO0O0 = c21915Oooo0oo.OooO0O0(str3);
                if (fragmentOooO0O0 == null) {
                    throw new IllegalStateException(C20593OooO0Oo.OooO0O0("No instantiated fragment for (", str3, ")"));
                }
                if (Oooo0o(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentOooO0O0);
                }
                c21915Oooo0oo.OooO00o(fragmentOooO0O0);
            }
        }
        if (fragmentManagerState.f64869OooOoO0 != null) {
            this.f64801OooO0Oo = new ArrayList<>(fragmentManagerState.f64869OooOoO0.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f64869OooOoO0;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i];
                backStackRecordState.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this);
                backStackRecordState.OooO00o(oooO00o);
                oooO00o.f64906OooOo0O = backStackRecordState.f64740OooOoo;
                int i2 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = backStackRecordState.f64735OooOo;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i2);
                    if (str4 != null) {
                        oooO00o.f65008OooO0OO.get(i2).f65026OooO0O0 = c21915Oooo0oo.OooO0O0(str4);
                    }
                    i2++;
                }
                oooO00o.OooO0o(1);
                if (Oooo0o(2)) {
                    StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "restoreAllState: back stack #", " (index ");
                    sbOooO0OO.append(oooO00o.f64906OooOo0O);
                    sbOooO0OO.append("): ");
                    sbOooO0OO.append(oooO00o);
                    Log.v("FragmentManager", sbOooO0OO.toString());
                    PrintWriter printWriter = new PrintWriter(new C21922OoooOOO());
                    oooO00o.OooOO0o("  ", printWriter, false);
                    printWriter.close();
                }
                this.f64801OooO0Oo.add(oooO00o);
                i++;
            }
        } else {
            this.f64801OooO0Oo = new ArrayList<>();
        }
        this.f64807OooOO0O.set(fragmentManagerState.f64868OooOoO);
        String str5 = fragmentManagerState.f64870OooOoOO;
        if (str5 != null) {
            Fragment fragmentOooO0O02 = c21915Oooo0oo.OooO0O0(str5);
            this.f64823OooOoOO = fragmentOooO0O02;
            OooOOo(fragmentOooO0O02);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f64872OooOoo0;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.f64808OooOO0o.put(arrayList3.get(i3), fragmentManagerState.f64871OooOoo.get(i3));
            }
        }
        this.f64832Oooo00o = new ArrayDeque<>(fragmentManagerState.f64873OooOooO);
    }

    public final Bundle Ooooo00() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        Oooo00O();
        OooOo0o();
        OooOoO(true);
        this.f64833Oooo0O0 = true;
        this.f64840OoooO00.f65038OooO = true;
        C21915Oooo0oo c21915Oooo0oo = this.f64800OooO0OO;
        c21915Oooo0oo.getClass();
        HashMap<String, C21914Oooo0oO> map = c21915Oooo0oo.f65051OooO0O0;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (C21914Oooo0oO c21914Oooo0oO : map.values()) {
            if (c21914Oooo0oO != null) {
                Fragment fragment = c21914Oooo0oO.f65046OooO0OO;
                c21915Oooo0oo.OooO(c21914Oooo0oO.OooOOO(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Oooo0o(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f64800OooO0OO.f65052OooO0OO;
        if (!map2.isEmpty()) {
            C21915Oooo0oo c21915Oooo0oo2 = this.f64800OooO0OO;
            synchronized (c21915Oooo0oo2.f65050OooO00o) {
                try {
                    backStackRecordStateArr = null;
                    if (c21915Oooo0oo2.f65050OooO00o.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(c21915Oooo0oo2.f65050OooO00o.size());
                        for (Fragment fragment2 : c21915Oooo0oo2.f65050OooO00o) {
                            arrayList.add(fragment2.mWho);
                            if (Oooo0o(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f64801OooO0Oo.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f64801OooO0Oo.get(i));
                    if (Oooo0o(2)) {
                        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "saveAllState: adding back stack #", ": ");
                        sbOooO0OO.append(this.f64801OooO0Oo.get(i));
                        Log.v("FragmentManager", sbOooO0OO.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f64867OooOo0o = arrayList2;
            fragmentManagerState.f64866OooOo = arrayList;
            fragmentManagerState.f64869OooOoO0 = backStackRecordStateArr;
            fragmentManagerState.f64868OooOoO = this.f64807OooOO0O.get();
            Fragment fragment3 = this.f64823OooOoOO;
            if (fragment3 != null) {
                fragmentManagerState.f64870OooOoOO = fragment3.mWho;
            }
            fragmentManagerState.f64872OooOoo0.addAll(this.f64808OooOO0o.keySet());
            fragmentManagerState.f64871OooOoo.addAll(this.f64808OooOO0o.values());
            fragmentManagerState.f64873OooOooO = new ArrayList<>(this.f64832Oooo00o);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f64810OooOOO0.keySet()) {
                bundle.putBundle(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("result_", str), this.f64810OooOOO0.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("fragment_", str2), map2.get(str2));
            }
        } else if (Oooo0o(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final Fragment.SavedState Ooooo0o(Fragment fragment) {
        C21914Oooo0oO c21914Oooo0oO = this.f64800OooO0OO.f65051OooO0O0.get(fragment.mWho);
        if (c21914Oooo0oO != null) {
            Fragment fragment2 = c21914Oooo0oO.f65046OooO0OO;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(c21914Oooo0oO.OooOOO());
                }
                return null;
            }
        }
        ooOO(new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void OooooO0() {
        synchronized (this.f64798OooO00o) {
            try {
                if (this.f64798OooO00o.size() == 1) {
                    this.f64816OooOo.f64993OooOoO0.removeCallbacks(this.f64839OoooO0);
                    this.f64816OooOo.f64993OooOoO0.post(this.f64839OoooO0);
                    o00Oo0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooooOO(Fragment fragment, boolean z) {
        ViewGroup viewGroupOooo0 = Oooo0(fragment);
        if (viewGroupOooo0 == null || !(viewGroupOooo0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupOooo0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooooOo(Bundle bundle, String str) {
        OooOOO0 oooOOO0 = this.f64809OooOOO.get(str);
        if (oooOOO0 != null) {
            if (oooOOO0.f64856OooOo0o.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0) {
                oooOOO0.OooO0OO(bundle, str);
            } else {
                this.f64810OooOOO0.put(str, bundle);
            }
        }
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void Oooooo(Fragment fragment, AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        if (fragment.equals(this.f64800OooO0OO.OooO0O0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = oooO0O0;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Oooooo0(String str, InterfaceC21987OooOoo interfaceC21987OooOoo, InterfaceC21912Oooo0o interfaceC21912Oooo0o) {
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            return;
        }
        C21878OooO0oO c21878OooO0oO = new C21878OooO0oO(str, interfaceC21912Oooo0o, lifecycle);
        OooOOO0 oooOOO0Put = this.f64809OooOOO.put(str, new OooOOO0(lifecycle, interfaceC21912Oooo0o, c21878OooO0oO));
        if (oooOOO0Put != null) {
            oooOOO0Put.f64856OooOo0o.OooO0OO(oooOOO0Put.f64857OooOoO0);
        }
        if (Oooo0o(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC21912Oooo0o);
        }
        lifecycle.OooO00o(c21878OooO0oO);
    }

    public final void OoooooO(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f64800OooO0OO.OooO0O0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f64823OooOoOO;
        this.f64823OooOoOO = fragment;
        OooOOo(fragment2);
        OooOOo(this.f64823OooOoOO);
    }

    public final void Ooooooo(Fragment fragment) {
        ViewGroup viewGroupOooo0 = Oooo0(fragment);
        if (viewGroupOooo0 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupOooo0.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupOooo0.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupOooo0.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final boolean o000oOoO(ArrayList<androidx.fragment.app.OooO00o> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int iOooOoo = OooOoo(i, str, (i2 & 1) != 0);
        if (iOooOoo < 0) {
            return false;
        }
        for (int size = this.f64801OooO0Oo.size() - 1; size >= iOooOoo; size--) {
            arrayList.add(this.f64801OooO0Oo.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void o00O0O(AbstractC21880OooOO0o cb) {
        C21905OooOooO c21905OooOooO = this.f64812OooOOOo;
        c21905OooOooO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(cb, "cb");
        synchronized (c21905OooOooO.f65001OooO0O0) {
            try {
                int size = c21905OooOooO.f65001OooO0O0.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (c21905OooOooO.f65001OooO0O0.get(i).f65002OooO00o == cb) {
                        c21905OooOooO.f65001OooO0O0.remove(i);
                        break;
                    }
                    i++;
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o00Oo0() {
        synchronized (this.f64798OooO00o) {
            try {
                if (!this.f64798OooO00o.isEmpty()) {
                    this.f64806OooOO0.setEnabled(true);
                    if (Oooo0o(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f64801OooO0Oo.size() + (this.f64805OooO0oo != null ? 1 : 0) > 0 && Oooo(this.f64821OooOoO);
                if (Oooo0o(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f64806OooOO0.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ooOO(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C21922OoooOOO());
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.f64816OooOo;
        if (abstractC21900OooOoO != null) {
            try {
                abstractC21900OooOoO.OooO0Oo(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            OooOo0O("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f64821OooOoO;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f64821OooOoO)));
            sb.append("}");
        } else {
            AbstractC21900OooOoO<?> abstractC21900OooOoO = this.f64816OooOo;
            if (abstractC21900OooOoO != null) {
                sb.append(abstractC21900OooOoO.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f64816OooOo)));
                sb.append("}");
            } else {
                sb.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
