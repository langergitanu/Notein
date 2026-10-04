package com.google.firebase.inappmessaging.internal;

import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
public class Schedulers {
    private final AbstractC33500OooOOOo computeScheduler;
    private final AbstractC33500OooOOOo ioScheduler;
    private final AbstractC33500OooOOOo mainThreadScheduler;

    public Schedulers(AbstractC33500OooOOOo abstractC33500OooOOOo, AbstractC33500OooOOOo abstractC33500OooOOOo2, AbstractC33500OooOOOo abstractC33500OooOOOo3) {
        this.ioScheduler = abstractC33500OooOOOo;
        this.computeScheduler = abstractC33500OooOOOo2;
        this.mainThreadScheduler = abstractC33500OooOOOo3;
    }

    public AbstractC33500OooOOOo computation() {
        return this.computeScheduler;
    }

    /* JADX INFO: renamed from: io */
    public AbstractC33500OooOOOo m75290io() {
        return this.ioScheduler;
    }

    public AbstractC33500OooOOOo mainThread() {
        return this.mainThreadScheduler;
    }
}
