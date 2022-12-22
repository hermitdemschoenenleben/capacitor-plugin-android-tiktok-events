import { registerPlugin } from '@capacitor/core';

import type { AndroidTiktokEventsPlugin } from './definitions';

const AndroidTiktokEvents = registerPlugin<AndroidTiktokEventsPlugin>('AndroidTiktokEvents', {
  web: () => import('./web').then(m => new m.AndroidTiktokEventsWeb()),
});

export * from './definitions';
export { AndroidTiktokEvents };
