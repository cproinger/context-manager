/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.provider;


import ctxmngr.ContextManager;
import ctxmngr.CtxmngrFactory;
import ctxmngr.CtxmngrPackage;

import java.util.Collection;
import java.util.List;

import named.provider.NamedElementItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ctxmngr.ContextManager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextManagerItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManagerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitialStatePropertyDescriptor(object);
			addFinalStatePropertyDescriptor(object);
			addCombinedManagerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextManager_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextManager_initialState_feature", "_UI_ContextManager_type"),
				 CtxmngrPackage.Literals.CONTEXT_MANAGER__INITIAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextManager_finalState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextManager_finalState_feature", "_UI_ContextManager_type"),
				 CtxmngrPackage.Literals.CONTEXT_MANAGER__FINAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combined Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCombinedManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextManager_combinedManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextManager_combinedManager_feature", "_UI_ContextManager_type"),
				 CtxmngrPackage.Literals.CONTEXT_MANAGER__COMBINED_MANAGER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CtxmngrPackage.Literals.CONTEXT_MANAGER__OWNED_STATE);
			childrenFeatures.add(CtxmngrPackage.Literals.CONTEXT_MANAGER__CONTEXT_PARAMETERS);
			childrenFeatures.add(CtxmngrPackage.Literals.CONTEXT_MANAGER__REMOTE_FIRINGS);
			childrenFeatures.add(CtxmngrPackage.Literals.CONTEXT_MANAGER__OWNED_TRANSITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ContextManager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextManager"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContextManager)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContextManager_type") :
			getString("_UI_ContextManager_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ContextManager.class)) {
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_STATE:
			case CtxmngrPackage.CONTEXT_MANAGER__CONTEXT_PARAMETERS:
			case CtxmngrPackage.CONTEXT_MANAGER__REMOTE_FIRINGS:
			case CtxmngrPackage.CONTEXT_MANAGER__OWNED_TRANSITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CtxmngrPackage.Literals.CONTEXT_MANAGER__OWNED_STATE,
				 CtxmngrFactory.eINSTANCE.createCtxState()));

		newChildDescriptors.add
			(createChildParameter
				(CtxmngrPackage.Literals.CONTEXT_MANAGER__CONTEXT_PARAMETERS,
				 CtxmngrFactory.eINSTANCE.createContextParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CtxmngrPackage.Literals.CONTEXT_MANAGER__REMOTE_FIRINGS,
				 CtxmngrFactory.eINSTANCE.createRemoteFiringDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CtxmngrPackage.Literals.CONTEXT_MANAGER__OWNED_TRANSITION,
				 CtxmngrFactory.eINSTANCE.createCtxTransition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CtxmngrEditPlugin.INSTANCE;
	}

}
