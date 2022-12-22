export interface AndroidTiktokEventsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  prepare(): Promise<any>;
  logEvent(options: { event: string }): Promise<any>;
}
