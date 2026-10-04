package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27262OooooOO extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE CommentEntity ADD COLUMN quote_id TEXT DEFAULT NULL", "ALTER TABLE OutlineEntity ADD COLUMN quote_id TEXT DEFAULT NULL", "CREATE TABLE IF NOT EXISTS `QuoteEntity` (`id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `color` INTEGER NOT NULL,  `label_rect` TEXT NOT NULL, `rect_list` TEXT NOT NULL,`text` TEXT NOT NULL, `link_type` INTEGER NOT NULL,`link_id` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
