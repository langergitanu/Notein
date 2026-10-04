package o0Ooo000;

import Oooo0.o000000O;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: o0Ooo000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29336OooO0oo extends C29344OooOOo {
    @Override // o0Ooo000.C29344OooOOo
    public final void OooO00o(NoteTreeInfo noteTreeInfo) {
        int i;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_title_item_tree_selection);
        if (textView != null) {
            textView.setText(noteTreeInfo.getTitle());
        }
        int iOrdinal = noteTreeInfo.getType().ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.ic_ni_grid_normal;
        } else if (iOrdinal == 1) {
            i = R.drawable.ic_ni_pdf;
        } else if (iOrdinal == 2) {
            i = R.drawable.ic_ni_note;
        } else {
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            i = R.drawable.ic_ni_folder;
        }
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.imgv_type_item_tree_selection);
        if (imageView != null) {
            imageView.setImageResource(i);
        }
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.imgv_expand_item_tree_selection);
        if (noteTreeInfo.isFolder()) {
            int i2 = noteTreeInfo.isSelected() ? R.drawable.ic_ni_arrow_drop_down_normal : R.drawable.ic_ni_arrow_right_normal;
            if (imageView2 != null) {
                imageView2.setVisibility(noteTreeInfo.isEmptyFolder() ? 8 : 0);
            }
            if (imageView2 != null) {
                imageView2.setImageResource(i2);
            }
            this.itemView.setBackground(null);
        } else {
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (noteTreeInfo.isSelected()) {
                View view = this.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_color_pressed));
            } else {
                this.itemView.setBackground(null);
            }
        }
        View viewFindViewById = this.itemView.findViewById(R.id.imgv_type_item_tree_selection);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = o000000O.OooO0o(24) * noteTreeInfo.getLevel();
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
    }
}
