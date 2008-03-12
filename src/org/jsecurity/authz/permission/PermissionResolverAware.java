/*
 * Copyright (C) 2005-2008 Les Hazlewood
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 *
 * Free Software Foundation, Inc.
 * 59 Temple Place, Suite 330
 * Boston, MA 02111-1307
 * USA
 *
 * Or, you may view it online at
 * http://www.opensource.org/licenses/lgpl-license.php
 */
package org.jsecurity.authz.permission;

/**
 * Interface implemented by a component that wishes to use any application-configured <tt>PermissionResolver</tt> that
 * might already exist instead of potentially creating one itself.
 *
 * <p>This is mostly implemented by {@link org.jsecurity.authz.Authorizer Authorizer} and
 * {@link org.jsecurity.realm.Realm Realm} implementations since they
 * are the ones performing permission checks and need to know how to resolve Strings into
 * {@link org.jsecurity.authz.Permission Permission} instances.
 *
 * @author Les Hazlewood
 * @since 0.9
 */
public interface PermissionResolverAware {

    /**
     * Sets the specified <tt>PermissionResolver</tt> on this instance.
     *
     * @param pr the <tt>PermissionResolver</tt> being set.
     */
    public void setPermissionResolver( PermissionResolver pr );
}
