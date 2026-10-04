package com.orion.notein.p607ui.noteeditor.propertypanel;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.ink.geometry.C21955OooO0Oo;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorChatFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import kotlin.jvm.internal.OooOOO0;
import o00O00OO.OooO0O0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32447OooOOo f75494OooO00o;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19345OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ OooO00o f75495OooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19345OooO00o(Fragment fragment, OooO00o oooO00o) {
            super(fragment);
            this.f75495OooO = oooO00o;
        }

        @Override // o00O00OO.OooO0O0
        public final Fragment OooO0o0(int i) {
            if (i == 0) {
                return new EditorSummaryFragment();
            }
            if (i == 1) {
                return new EditorChatFragment();
            }
            throw new IllegalArgumentException("unknown tab");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
        public final int getItemCount() {
            return ((Boolean) this.f75495OooO.f75494OooO00o.getValue()).booleanValue() ? 2 : 1;
        }
    }

    public OooO00o() {
        OooO0O0.OooO00o oooO00o = OooO0O0.OooO00o.f75497OooOo0o;
        this.f75494OooO00o = C20519OooO0Oo.OooO0OO(new C21955OooO0Oo(1));
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final o00O00OO.OooO0O0 OooO00o(Fragment fragment) {
        return new C19345OooO00o(fragment, this);
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final String OooO0O0(Context context, int i) {
        String string = context.getString(R.string.lab_feature_ai_assistant_label);
        OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final TabLayoutMediator OooO0OO(Context context, TabLayout tabLayout, ViewPager2 propertyPager) {
        OooOOO0.OooO0oO(tabLayout, "tabLayout");
        OooOOO0.OooO0oO(propertyPager, "propertyPager");
        return new TabLayoutMediator(tabLayout, propertyPager, new com.google.firebase.crashlytics.internal.OooO00o(context));
    }
}
