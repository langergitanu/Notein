package com.orion.notein.domain.models.paper;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/domain/models/paper/PaperColorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "Lcom/orion/notein/domain/models/paper/ColorAlreadyExistsException;", "Lcom/orion/notein/domain/models/paper/ColorLimitExceededException;", "Lcom/orion/notein/domain/models/paper/ColorNotFoundException;", "Lcom/orion/notein/domain/models/paper/DefaultColorCannotBeRemovedException;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class PaperColorException extends Exception {
    public /* synthetic */ PaperColorException(String str, C24018OooO0oo c24018OooO0oo) {
        this(str);
    }

    private PaperColorException(String str) {
        super(str);
    }
}
