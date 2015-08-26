/******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: JBoss by Red Hat - Initial implementation.
 *****************************************************************************/
package org.jboss.tools.fuse.transformation.editor.internal.util;

import java.util.ArrayList;
import java.util.List;

import org.jboss.tools.fuse.transformation.MappingOperation;
import org.jboss.tools.fuse.transformation.MappingType;
import org.jboss.tools.fuse.transformation.model.Model;

/**
 *
 */
public class MappingPlaceholder implements MappingOperation<Object, Model> {

    private Object source;
    private List<Integer> sourceIndexes;
    private Model target;
    private List<Integer> targetIndexes;
    private String sourceDateFormat;
    private String targetDateFormat;

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#getSource()
     */
    @Override
    public Object getSource() {
        return source;
    }

    @Override
    public String getSourceDateFormat() {
        return sourceDateFormat;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#getSourceIndex()
     */
    @Override
    public List<Integer> getSourceIndex() {
        if (sourceIndexes != null)
            return new ArrayList<>(sourceIndexes);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#getTarget()
     */
    @Override
    public Model getTarget() {
        return target;
    }

    @Override
    public String getTargetDateFormat() {
        return targetDateFormat;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#getTargetIndex()
     */
    @Override
    public List<Integer> getTargetIndex() {
        if (targetIndexes != null)
            return new ArrayList<>(targetIndexes);
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#getType()
     */
    @Override
    public MappingType getType() {
        return null;
    }

    void setSource(final Object source) {
        this.source = source;
    }

    @Override
    public void setSourceDateFormat(String format) {
        sourceDateFormat = format;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#setSourceIndex()
     */
    @Override
    public void setSourceIndex(List<Integer> indexes) {
        sourceIndexes = indexes;
    }

    void setTarget(final Model target) {
        this.target = target;
    }

    @Override
    public void setTargetDateFormat(String format) {
        targetDateFormat = format;
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.tools.fuse.transformation.MappingOperation#setTargetIndex()
     */
    @Override
    public void setTargetIndex(List<Integer> indexes) {
        targetIndexes = indexes;
    }
}
