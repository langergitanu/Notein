package com.orion.notein.p607ui.noteeditor.propertypanel;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import kotlin.jvm.internal.OooOOO0;
import o00O00OO.OooO0O0;
import o0Oo0ooO.C28435OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends OooO0O0 {

    public static final class OooO00o extends OooO0O0 {
        @Override // o00O00OO.OooO0O0
        public final Fragment OooO0o0(int i) {
            if (i == 0) {
                return new EditorPreviewFragment();
            }
            if (i == 1) {
                return new EditorOutlineFragment();
            }
            if (i == 2) {
                return new EditorCommentFragment();
            }
            throw new IllegalArgumentException("unknown tab");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
        public final int getItemCount() {
            return 3;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final OooO0O0 OooO00o(Fragment fragment) {
        return new OooO00o(fragment);
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final String OooO0O0(Context context, int i) {
        if (i == 0) {
            String string = context.getString(R.string.editor_overview);
            OooOOO0.OooO0o(string, "getString(...)");
            return string;
        }
        if (i == 1) {
            String string2 = context.getString(R.string.editor_outline);
            OooOOO0.OooO0o(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            return "Unknown";
        }
        String string3 = context.getString(R.string.editor_comment);
        OooOOO0.OooO0o(string3, "getString(...)");
        return string3;
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0
    public final TabLayoutMediator OooO0OO(Context context, TabLayout tabLayout, ViewPager2 propertyPager) {
        OooOOO0.OooO0oO(tabLayout, "tabLayout");
        OooOOO0.OooO0oO(propertyPager, "propertyPager");
        return new TabLayoutMediator(tabLayout, propertyPager, new C28435OooOooO(context));
    }
}
